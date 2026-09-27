package com.santiagorey.tallerlazycolumn.data

import com.santiagorey.tallerlazycolumn.model.Post
import com.santiagorey.tallerlazycolumn.model.Story

object DataSource {

    fun getPosts(): List<Post> = listOf(

        Post(
            id = 1,
            username = "android_developer",
            profileImageUrl = "https://picsum.photos/seed/user1/200/200",
            imageUrl = "https://picsum.photos/seed/post1/800/800",
            likes = 1230,
            caption = "Explorando Jetpack Compose 🚀 #Android #Kotlin"
        ),

        Post(
            id = 2,
            username = "kotlin_ninja",
            profileImageUrl = "https://picsum.photos/seed/user2/200/200",
            imageUrl = "https://picsum.photos/seed/post2/800/800",
            likes = 887,
            caption = "Data classes son lo mejor feature de Kotlin ❤️",
            isLiked = true
        ),

        Post(
            id = 3,
            username = "compose_ui",
            profileImageUrl = "https://picsum.photos/seed/user3/200/200",
            imageUrl = "https://picsum.photos/seed/post3/800/800",
            likes = 3456,
            caption = "Material3 + Compose = perfecta combinación 🎨"
        ),

        Post(
            id = 4,
            username = "google_devs",
            profileImageUrl = "https://picsum.photos/seed/user4/200/200",
            imageUrl = "https://picsum.photos/seed/post4/800/800",
            likes = 12891,
            caption = "Android 15 trae increíbles mejoras de performance! 📱"
        ),

        Post(
            id = 5,
            username = "mobile_craft",
            profileImageUrl = "https://picsum.photos/seed/user5/200/200",
            imageUrl = "https://picsum.photos/seed/post5/800/800",
            likes = 669,
            caption = "LazyColumn vs RecyclerView: ¿cuál prefieres? 🤔"
        ),

        Post(
            id = 6,
            username = "ux_android",
            profileImageUrl = "https://picsum.photos/seed/user6/200/200",
            imageUrl = "https://picsum.photos/seed/post6/800/800",
            likes = 2343,
            caption = "Animaciones fluidas con animateAsState ✨",
            isLiked = true
        ),

        Post(
            id = 7,
            username = "dev_colombia",
            profileImageUrl = "https://picsum.photos/seed/user7/200/200",
            imageUrl = "https://picsum.photos/seed/post7/800/800",
            likes = 645,
            caption = "Local hack super fácil cargar imágenes en Compose 📱"
        ),

        // Los 3 adicionales que pide el ejercicio
        Post(
            id = 8,
            username = "santiago_dev",
            profileImageUrl = "https://picsum.photos/seed/user8/200/200",
            imageUrl = "https://picsum.photos/seed/post8/800/800",
            likes = 150,
            caption = "Aprendiendo LazyColumn en Compose 🚀"
        ),

        Post(
            id = 9,
            username = "compose_student",
            profileImageUrl = "https://picsum.photos/seed/user9/200/200",
            imageUrl = "https://picsum.photos/seed/post9/800/800",
            likes = 320,
            caption = "Cada día aprendiendo más Kotlin 💻"
        ),

        Post(
            id = 10,
            username = "android_code",
            profileImageUrl = "https://picsum.photos/seed/user10/200/200",
            imageUrl = "https://picsum.photos/seed/post10/800/800",
            likes = 540,
            caption = "Mi décimo post con Jetpack Compose 🔥"
        )
    )

    fun getStories(): List<Story> = listOf(

        Story(
            id = 1,
            username = "tu_historia",
            profileImageUrl = "https://picsum.photos/seed/s1/200/200",
            hasSeen = false
        ),

        Story(
            id = 2,
            username = "android_dev",
            profileImageUrl = "https://picsum.photos/seed/s2/200/200"
        ),

        Story(
            id = 3,
            username = "kotlin_fan",
            profileImageUrl = "https://picsum.photos/seed/s3/200/200"
        ),

        Story(
            id = 4,
            username = "google_io",
            profileImageUrl = "https://picsum.photos/seed/s4/200/200",
            hasSeen = true
        ),

        Story(
            id = 5,
            username = "compose_ui",
            profileImageUrl = "https://picsum.photos/seed/s5/200/200"
        )
    )
}