# 🎬 TMDB Android App  

[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com/)
[![Kotlin](https://img.shields.io/badge/Language-Kotlin-blue.svg)](https://kotlinlang.org/)
[![Architecture](https://img.shields.io/badge/Architecture-MVVM-orange.svg)]()
[![License](https://img.shields.io/badge/License-MIT-lightgrey.svg)](LICENSE)

A modern Android app that fetches data from **The Movie Database (TMDB)** API to display movies, TV shows, and artists.  
Built with **Kotlin**, **MVVM**, **Dagger 2**, **Room**, **Retrofit**, and **Coroutines** following **Clean Architecture** principles.

---

## 📱 Demo  

> *(Add a GIF or screenshot of your app UI here)*  
> Example:  
> ![TMDB App Demo](screenshots/demo.gif)

---

## ⚙️ Tech Stack  

- **Language:** Kotlin  
- **Architecture:** MVVM + Repository Pattern  
- **Dependency Injection:** Dagger 2  
- **Networking:** Retrofit + OkHttp  
- **Database:** Room (with Coroutines support)  
- **Image Loading:** Coil (or Glide)  
- **Async:** Kotlin Coroutines + Flow  
- **UI:** XML + ViewModel + LiveData  

---

## 🚀 Features  

- Browse popular, top-rated, and upcoming movies 🎞️  
- View detailed information for movies, TV shows, and artists  
- Search functionality for movies, TV shows, and people  
- Offline caching with Room  
- Reactive UI with LiveData  
- Clean separation of layers (UI, Domain, Data)  
- Dependency Injection via Dagger 2  

---

## 🔑 API Reference  

This app uses [The Movie Database (TMDB)](https://www.themoviedb.org/) API.  

To run locally, you’ll need your own API key:

1. Create an account at [TMDB API](https://www.themoviedb.org/documentation/api)  
2. Copy your API key  
3. Add the key to your **`gradle.properties`** file:

   ```properties
   TMDB_API_KEY = "your_api_key_here"
