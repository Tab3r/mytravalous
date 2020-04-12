# GPX

https://www.topografix.com/gpx.asp

## Términos

* Metadatos
* Waypoints: Puntos. Puntos de interes. Expresados en WGS84 (lon-lat). Tienen atributos asociados:
  * Elevación (en metros)
  * Marca de tiempo (UTC)
* Routes: Lineas. Conjunto de puntos de interes (route points) para describir una ruta a seguir.
* Tracks: MultiLineas. Describe un camino hecho con un gps. Puede cortarse, y continuar 
(por ejemplo cuando se corta el GPS y vuelve).

Un persona diseña una ruta para luego seguir un camino.

## Estándar

* wptType: Waypoint
* rteType: Route
* trkType: Track
