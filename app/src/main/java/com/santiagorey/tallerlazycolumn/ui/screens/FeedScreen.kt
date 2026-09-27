package com.santiagorey.tallerlazycolumn.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.santiagorey.tallerlazycolumn.data.DataSource
import com.santiagorey.tallerlazycolumn.ui.components.PostCard
import com.santiagorey.tallerlazycolumn.ui.components.StoriesRow

@Composable
fun FeedScreen() {

    val posts = remember { DataSource.getPosts() }
    val stories = remember { DataSource.getStories() }

    Scaffold(
        topBar = { InstagramTopBar() }
    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            item(
                key = "stories_row"
            ) {
                StoriesRow(stories = stories)
                HorizontalDivider()
            }

            items(
                items = posts,
                key = { post -> post.id }
            ) { post ->

                PostCard(
                    post = post,
                    onLikeClick = { likedPost ->
                        // Después podemos mostrarlo en Logcat
                    }
                )
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramTopBar() {

    androidx.compose.material3.TopAppBar(
        title = {
            androidx.compose.material3.Text(
                text = "Instagram"
            )
        }
    )
}
