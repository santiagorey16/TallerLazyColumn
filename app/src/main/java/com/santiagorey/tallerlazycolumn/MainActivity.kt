package com.santiagorey.tallerlazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.santiagorey.tallerlazycolumn.model.Post
import com.santiagorey.tallerlazycolumn.ui.theme.TallerLazyColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val post = Post(
            id = 1,
            username = "Santiago",
            profileImageUrl = "perfil.jpg",
            imageUrl = "foto.jpg",
            likes = 10,
            caption = "Mi primer post"
        )

        println(post)

        val postConLike = post.copy(isLiked = true)
        println(postConLike)
    }
}


