# 🍔 Abecerra Food App

Aplicación Android desarrollada en **Kotlin + Jetpack Compose** para mostrar un catálogo de restaurantes, categorías y platillos destacados.  

La app utiliza **Coil** para la carga de imágenes, un sistema de tipografías personalizadas y componentes basados en Material 3.  

---

## ✨ Características principales
- **Pantalla principal completa** con:
  - Header de bienvenida.  
  - Listado de categorías.  
  - Restaurantes destacados.  
  - Platillos destacados en cuadrícula (FlowRow).  
- **Diseño en Compose** con uso de `Card`, `Row`, `Column` y `FlowRow` para un layout moderno y eficiente.  
- **Carga de imágenes remotas** con [Coil 3](https://coil-kt.github.io/coil/).  
- **Compatibilidad Material 3** (uso de tipografía, colores y elevaciones).  

---

## 📂 Estructura del proyecto

```
app/
 ├── components/
 │    ├── Header.kt               # Cabecera de la pantalla principal
 │    ├── Categories.kt           # Sección de categorías
 │    ├── Best_restaurants.kt     # Sección de restaurantes
 │    ├── Best_dishes.kt          # Grid de platillos con FlowRow
 │
 ├── dataclasses/
 │    ├── Restaurant.kt   # Modelo de datos para restaurantes
 │    ├── Category.kt     # Modelo de datos para categorías
 │    └── Food.kt         # Modelo de datos para platillos
 │
 ├── screens/
 │    └── Home.kt       # Encargado de renderizar los componentes
 │
 ├── ui/theme/
 │    ├── Color.kt      # Paleta de colores
 │    ├── Theme.kt      # Configuración de MaterialTheme
 │    └── Type.kt       # Tipografía personalizada
 │
 └── MainActivity.kt    # Entrada principal de la aplicación
```

---

## ⚙️ Instalación y ejecución

1. Clona el repositorio:  
   ```bash
   git clone https://github.com/tuusuario/abecerra-food-app.git
   cd abecerra-food-app
   ```

2. Abre el proyecto en **Android Studio** (versión Flamingo o superior recomendada).  

3. Sincroniza las dependencias de Gradle.  

4. Ejecuta la aplicación en un emulador o dispositivo físico.  

---

## 📦 Dependencias principales

- **Jetpack Compose**: UI declarativa moderna.  
- **Material 3**: componentes y theming.  
- **Coil 3**: carga de imágenes con soporte para OkHttp.  

Ejemplo de dependencias en `build.gradle.kts`:
```kotlin
implementation("io.coil-kt.coil3:coil-compose:3.1.0")
implementation("io.coil-kt.coil3:coil-network-okhttp:3.1.0")
```

---

## 🚀 Estado actual

- [x] Header implementado.  
- [x] Tipografía y colores personalizados.  
- [x] Categorías con íconos circulares.  
- [x] Restaurantes destacados con `Card`.  
- [x] Platillos destacados renderizados en dos columnas (`FlowRow`).  
- [x] Pantalla principal completada.  

---

## 📌 Próximos pasos

- [ ] Agregar navegación a detalle de platillos.  
- [ ] Implementar un sistema de favoritos.  
- [ ] Conectar la data a un backend o API real.  

---

## 👨‍💻 Autor

Proyecto desarrollado por **Angel Becerra** como parte de práctica en **Kotlin + Jetpack Compose**.  
