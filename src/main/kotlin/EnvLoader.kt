object EnvLoader {
    private var env: Map<String, String> = emptyMap()

    fun load(path: String = System.getProperty("user.dir") + "/.env"): EnvLoader {
        val file = java.io.File(path)
        if (!file.exists()) {
            println("EnvLoader: No .env file found at $path")
            return this
        }
        env = file.readLines()
            .filter { it.contains("=") && !it.startsWith("#") && it.isNotBlank() }
            .associate {
                val (key, value) = it.split("=", limit = 2)
                key.trim() to value.trim()
            }
        println("EnvLoader: Loaded ${env.size} variables from $path")
        return this
    }

    operator fun get(key: String): String? = env[key]

    fun require(key: String): String =
        env[key] ?: error("EnvLoader: '$key' not found in .env")

    fun all(): Map<String, String> = env
}