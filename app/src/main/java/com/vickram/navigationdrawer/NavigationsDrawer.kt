@file:OptIn(ExperimentalMaterial3Api::class)

package com.vickram.navigationdrawer

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SideNav(navController: NavHostController = rememberNavController()) {
    val items = listOf(
        NavGraphs.Home,
        NavGraphs.Profile,
        NavGraphs.Settings,
        NavGraphs.Favourite,
        NavGraphs.LogOut
    )
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val selectedItem by remember { mutableStateOf(items[0]) }
    var searchState by remember { mutableStateOf(false) }
    var query by remember { mutableStateOf("") }
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Spacer(modifier = Modifier.height(12.dp))
                items.forEach { item ->
                    NavigationDrawerItem(
                        icon = {
                            Icon(imageVector = item.icon, contentDescription = null)
                        },
                        label = {
                            Text(text = item.name)
                        },
                        selected = item == selectedItem,
                        onClick = {
                            scope.launch { drawerState.close() }
                            navController.navigate(item.route)
                        },
                        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                    )
                }
            }
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(text = stringResource(id = R.string.app_name))
                            },
                            navigationIcon = {
                                IconButton(
                                    onClick = { scope.launch { drawerState.open() } }
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Menu,
                                        contentDescription = null
                                    )
                                }
                            },
                            actions = {
                                IconButton(
                                    onClick = { searchState = true }
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = null
                                    )
                                }
                            }
                        )
                    }

                ) {

                    NavHost(navController = navController, startDestination = "home") {
                            composable(NavGraphs.Home.route) {
                                HomeScreen(navController)
                            }
                            composable(NavGraphs.Profile.route) {
                                Profile(navController)
                            }
                            composable(NavGraphs.Settings.route) {
                                SettingsScreen(navController)
                            }
                            composable(NavGraphs.Favourite.route) {
                                FavouriteScreen(navController)
                            }
                            composable(NavGraphs.LogOut.route) {
                                LogOutScreen(navController)
                            }

                    }
                }
            }

        }
    )
    if (searchState) {
        TextField(
            value = query,
            onValueChange = { query = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 2.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "search")
            },
            trailingIcon = {
                if (searchState) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "close",
                        modifier = Modifier.clickable {
                            query = ""
                            searchState = false
                        })
                }
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = colorResource(id = R.color.purple_200),
                textColor = Color.White,
                focusedLeadingIconColor = Color.White,
                disabledLeadingIconColor = Color.White
            ),
            keyboardActions = KeyboardActions(onDone = { defaultKeyboardAction(imeAction = ImeAction.Done) }),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search)
        )
    }
}

sealed class NavGraphs(
    val icon: ImageVector,
    val name: String,
    val route: String,
) {
    object Home : NavGraphs(
        icon = Icons.Default.Home,
        name = "Home",
        route = "home"
    )

    object Profile : NavGraphs(
        icon = Icons.Default.Person,
        name = "Profile",
        route = "profile"
    )

    object Settings : NavGraphs(
        icon = Icons.Default.Settings,
        name = "Settings",
        route = "settings"
    )

    object Favourite : NavGraphs(
        icon = Icons.Default.Favorite,
        name = "Favourite",
        route = "favorite"
    )

    object LogOut : NavGraphs(
        icon = Icons.Default.ArrowBack,
        name = "LogOut",
        route = "logout"
    )
}

@ExperimentalMaterial3Api
@Composable
@Preview(showBackground = true)
fun Dpreview() {
    SideNav()
}