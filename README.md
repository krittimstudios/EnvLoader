# EnvLoader

A lightweight, hassle-free environment variable loader for **Kotlin/JVM** applications. Easily load `.env` configurations into your application with minimal boilerplate code.

[![License: MIT](https://shields.io)](https://opensource.org)
[![JitPack](https://jitpack.io)](https://jitpack.io)

---

## 📦 Installation

This library is hosted on **JitPack**. Add it to your project by following these steps:

### 1. Add the Repository
Add the JitPack repository to your `settings.gradle.kts` file:

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

### 2. Add the Dependency
Add the dependency to your application module's `build.gradle.kts`:

```kotlin
dependencies {
    implementation("com.github.krittimstudios:EnvLoader:1.0.0")
}
```

---

## 🛠️ Usage

### 1. Create your `.env` file
Place a `.env` file in the root directory of your project:

```env
DB_HOST=localhost
DB_PORT=5432
API_KEY=your_secret_api_key
```

### 2. Load variables in Kotlin
Initialize the loader at the start of your application (usually inside your `main` function):

```kotlin
import com.krittimstudios.envloader.EnvLoader

fun main() {
    // Load the .env file
    EnvLoader.load() 

    // Access variables using standard System methods
    val dbHost = System.getenv("DB_HOST")
    println("Database Host: \$dbHost")
}
```

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

---

## 🤝 Contributing

Created and maintained by [Krittim Studios](https://github.com/krittimstudios). Feel free to open issues or submit pull requests to help improve this utility!
