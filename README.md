# Proyecto Federacion de Voleibol
![Versión](https://img.shields.io/badge/versión-1.2.1-brightgreen)
![Estado del Proyecto](https://img.shields.io/badge/estado-en%20desarrollo-orange?logo=github)
![Languages](https://img.shields.io/github/languages/top/FederacionVoleibol/AplicacionVoleibol)
![Tamaño del Repositorio](https://img.shields.io/github/repo-size/FederacionVoleibol/AplicacionVoleibol)
<br>
![Commits en GitHub](https://badgen.net/github/commits/FederacionVoleibol/AplicacionVoleibol)
![Pull Requests Abiertos](https://img.shields.io/github/issues-pr/FederacionVoleibol/AplicacionVoleibol)
![Pull Requests Cerrados](https://img.shields.io/github/issues-pr-closed/FederacionVoleibol/AplicacionVoleibol)
![Miembros del Repositorio](https://img.shields.io/badge/miembros-4-blue)



## Colaboradores
<table>
  <tr>
    <td align="center"><a href="https://github.com/QuiliDev"><img src="https://github.com/QuiliDev.png" width="100px;" alt=""/><br /><sub><b>👨‍💻 Anthony Quiliche</b></sub></a></td>
    <td align="center"><a href="https://github.com/alaiinluquee"><img src="https://github.com/alaiinluquee.png" width="100px;" alt=""/><br /><sub><b>👨‍💻 Alain Luque</b></sub></a></td>
    <td align="center"><a href="https://github.com/claraurq"><img src="https://github.com/claraurq.png" width="100px;" alt=""/><br /><sub><b>👩‍💻 Clara Urquijo</b></sub></a></td>
    <td align="center"><a href="https://github.com/AsierPinto"><img src="https://github.com/AsierPinto.png" width="100px;" alt=""/><br /><sub><b>👨‍💻 Asier Pinto</b></sub></a></td>
  </tr>
</table>
<br>

# Guía para Colaboración en GitHub y Eclipse🚀

# Tabla de Contenido

- [1. Términos Comunes en GitHub](#1-términos-comunes-en-github)
- [2. Configurar GitHub para la Colaboración en el Proyecto con Eclipse](#2-configurar-github-para-la-colaboración-en-el-proyecto-con-eclipse)
- [3. Pasos para Realizar un MERGE desde Eclipse](#3-pasos-para-realizar-un-merge-desde-eclipse)
- [4. Cómo Hacer un Pull Request desde `feature1anthony` a `developer` en GitHub](#4-cómo-hacer-un-pull-request-desde-feature1anthony-a-developer-en-github)
- [5. Cómo resolver conflictos al hacer Pull Request Merge](#5-cómo-resolver-conflictos-al-hacer-pull-request-merge)
- [6. Recursos para Aprender más sobre GitHub](#6-recursos-para-aprender-más-sobre-github)

---


## 1. Términos Comunes en GitHub📖

Los términos comunes en GitHub:

- **Repositorio (Repository)**: Almacén donde se guarda el código de un proyecto, incluyendo todos los archivos, el historial de cambios (*commits*) y las ramas.
- **Commit**: Captura de los cambios realizados en el código; guarda una versión específica del proyecto en un momento dado y lleva un mensaje descriptivo.
- **Push**: Envía los *commits* locales al repositorio remoto en GitHub para sincronizar el trabajo local con la nube.
- **Pull**: Actualiza la copia local con los últimos cambios del repositorio remoto, combinando los cambios con el código local.
- **Branch (Rama)**: Línea de desarrollo separada del código principal (*main* o *develop*), donde se puede trabajar en nuevas funcionalidades o correcciones sin afectar la versión estable.
- **Merge**: Proceso de combinar los cambios de una rama con otra, generalmente una rama de trabajo (*feature*) hacia una rama de desarrollo o principal.
- **Pull Request (PR)**: Solicitud para que los cambios en una rama sean revisados y fusionados con otra rama; permite la revisión en equipo.
- **Fork**: Copia de un repositorio que pertenece a otro usuario; permite trabajar en un proyecto sin afectar el repositorio original.
- **Clone**: Crear una copia exacta de un repositorio en la computadora local, permitiendo trabajar en él.
- **Git**: Herramienta de control de versiones que GitHub utiliza para manejar el historial de cambios, permitiendo colaborar y revertir errores.
- **README**: Archivo de documentación principal de un proyecto en GitHub que contiene información básica sobre el proyecto.
- **Issue**: Forma de rastrear problemas, errores o mejoras en el proyecto; similar a tickets de soporte.
- **GitHub Actions**: Herramienta de integración continua de GitHub para automatizar tareas como pruebas de código o despliegues.
- **Release**: Versión empaquetada del proyecto lista para distribución, útil para marcar versiones estables del software.
- **Milestone**: Grupo de *issues* y *pull requests* asociados a un objetivo específico o fase del proyecto, ayudando en la organización y planificación.

#### Diferencia entre Pull Request y Pull
El término *Pull Request* es específico de **GitHub** y otras plataformas de hospedaje de repositorios basadas en Git, como GitLab, Bitbucket y Azure DevOps. **No es un comando o concepto nativo de Git**.

### Diferencia entre Git y GitHub respecto a Pull Request
- **Git**: Git es un sistema de control de versiones que maneja *branches*, *commits*, *merges*, y *pulls*, pero no tiene un concepto de *Pull Request* integrado. En Git, si quieres integrar cambios entre ramas, haces un *merge* directamente desde la línea de comandos.
  
- **GitHub y plataformas similares**: Introdujeron el concepto de *Pull Request* para facilitar la colaboración en proyectos. El *Pull Request* permite a los desarrolladores proponer, revisar y comentar cambios en una interfaz gráfica, lo que hace que el flujo de trabajo sea más colaborativo y visual. GitHub popularizó esta funcionalidad, y por eso el término *Pull Request* se asocia comúnmente con su plataforma.

En resumen, **Pull Request es un concepto añadido por plataformas de hospedaje de código, como GitHub**, y no es parte de Git en sí.


---
## 2. Configurar GitHub para la Colaboración en el Proyecto con Eclipse


## 2.1 Pasos para Trabajar con GitHub en Eclipse

Para trabajar en un proyecto en Eclipse con GitHub, sigue estos pasos:

### Configuración Inicial:
1. **Configurar Git en Eclipse**:
   - Instala el complemento *EGit* en Eclipse si aún no lo tienes.
   - Instala Git en tu sistema desde [Git SCM](https://git-scm.com/) si es necesario.
   - Por lo general las ultimas versines ya viene instalado por defecto.

2. **Clonar un Repositorio de GitHub**:
   - Abre Eclipse y selecciona *File > Import > Git > Projects from Git > Clone URI*.
   - Ingresa la URL del repositorio GitHub y autentícate si es necesario.

3. **Crear un Proyecto en Eclipse y Vincularlo con GitHub**:
   - Crea un proyecto en Eclipse y selecciona *Team > Share Project...*.
   - Selecciona Git y luego *Team > Remote > Push...* para conectar tu repositorio local con el repositorio remoto en GitHub.

## 2.2 Flujo de Trabajo en Github con el Proyecto:

Para trabajar en equipo en un proyecto de Java utilizando Eclipse y GitHub, hicimos un flujo de trabajo recomendado:

**Cada miembro trabaja en su propia rama**: Crea ramas específicas para cada miembro del equipo (`feature1anthony`, `feature2alain`, `feature3clara`, `feature4asier`). Cada quien puede hacer cambios, *commit* y *push* en su propia rama, sin afectar el código de otros.

**Hacer Commits y Push**: Las buenas practicas de programación nos suguiere hacer **commits** y **pushes** regularmente (cada 3 horas es un intervalo efectivo) en la rama individual para facilitar el seguimiento y revisión de cambios.

**Uso de Pull Requests para Revisiones y Merges a `developer`**: 
   - Una vez que cada miembro ha finalizado una característica o cambio importante, debe abrir un *Pull Request* (PR) en GitHub para fusionar su rama con `developer` por ejemplo.
   - Todos los miembros del equipo pueden revisar el PR antes de fusionarlo con `developer`. Este flujo evita errores y conflictos en el código y asegura una mayor calidad del proyecto.

**Mantener `developer` Estable**: La rama `developer` debe contener una versión funcional y lista para pruebas de integración, mientras que la rama `main` (o `master`) debería mantenerse solo para versiones estables y listas para producción.

Este flujo permite que nuestro proyecto progrese de manera organizada, minimizando errores y facilitando la colaboración del equipo.

### Guia de pasos en Eclipse para subir a Github:

1. **Trabajar con Ramas en Eclipse**:
   - Para crear una nueva rama, selecciona *Team > Switch To > New Branch...* y define el nombre de la rama.
   - Realiza los cambios en la nueva rama y luego haz *commit* y *push*.

1. **Actualizar tu Proyecto (Pull)**:
   - Antes de realizar cambios, selecciona *Team > Pull* para obtener actualizaciones del repositorio remoto y evitar conflictos.
3. **Realizar Cambios y Hacer Commits**:
   - Realiza los cambios en tu código, guarda los archivos y selecciona *Team > Commit...*.
   - Escribe un mensaje descriptivo del cambio y confirma el *commit*.

4. **Enviar Cambios al Repositorio Remoto (Push)**:
   - Ve a *Team > Push to Upstream* para enviar los cambios al repositorio remoto en GitHub.
   

5. **Revisar y Fusionar Cambios (Pull Request)**:
   - Si prefieres usar GitHub para revisar los cambios, abre un *Pull Request* para que el equipo revise antes de fusionar.

6. **Resolver Conflictos**:
   - Si Eclipse marca algún conflicto, resuélvelo manualmente y luego guarda los archivos, realiza un *commit* y haz *push* para aplicar los cambios.


## 3. Pasos para Realizar un MERGE desde Eclipse
Aquí tienes los pasos detallados para hacer un *merge* de la rama `feature1anthony` a `developer` usando Eclipse y GitHub:

### Paso 1: Cambiar a la Rama `developer` en Eclipse
1. Abre Eclipse y selecciona el proyecto en el que estás trabajando.
2. Haz clic derecho sobre el proyecto, ve a *Team > Switch To > developer*. Esto asegura que estés en la rama `developer`, que es la rama de destino para el *merge*.

### Paso 2: Iniciar el Merge desde `feature1anthony` a `developer`
1. Una vez en la rama `developer`, haz clic derecho en el proyecto y selecciona *Team > Merge...*.
2. En la ventana que se abre, selecciona la rama `feature1anthony` como la rama de origen.
3. Confirma el *merge* para combinar los cambios de `feature1anthony` en `developer`.

### Paso 3: Resolver Conflictos (si los hay)
- Si Eclipse detecta conflictos, verás una lista de archivos en conflicto.
- Abre cada archivo en conflicto y resuélvelo manualmente (Eclipse marcará las secciones en conflicto).
- Después de resolver cada conflicto, guarda los archivos y realiza un *commit* para confirmar las resoluciones.

### Paso 4: Hacer el Commit de Merge en `developer`
1. Después de resolver todos los conflictos (si los hubo), haz clic derecho en el proyecto y selecciona *Team > Commit...*.
2. Escribe un mensaje de commit que explique el *merge*, por ejemplo: “Merge de feature1anthony a develop”.
3. Haz clic en *Commit and Push* para guardar y subir los cambios al repositorio remoto en GitHub.

### Paso 5: Verificar el Merge en GitHub
1. Ve a tu repositorio en GitHub y verifica que la rama `developer` ahora contiene los cambios de `feature1anthony`.
2. Si todo está correcto, la rama `feature1anthony` puede ser eliminada si ya no se necesita.

Este flujo asegura que los cambios de `feature1anthony` se integren en `developer` y que el equipo pueda revisar y continuar trabajando sin conflictos.

## 4. Cómo Hacer un Pull Request desde `feature1anthony` a `developer` en GitHub

Hacer un *Pull Request (PR)* es una excelente práctica, especialmente en nuestro proyecto, ya que permite revisar los cambios antes de fusionarlos en la rama `developer`. Los pasos son los siguientes:


1. **Subir los Cambios a GitHub**:
   - Asegúrate de que todos los cambios de la rama `feature1anthony` estén guardados y subidos a GitHub (haz un *commit* and *push* desde Eclipse).

2. **Crear el Pull Request en GitHub**:
   - Ve al repositorio en GitHub y selecciona la pestaña *Pull Requests*.
   - Haz clic en *New Pull Request*.
   - Selecciona `developer` como la rama de destino (base) y `feature1anthony` como la rama de origen (compare).
   - GitHub mostrará una comparación de los cambios. Revisa los cambios para asegurarte de que todo está correcto.

3. **Describir y Asignar el Pull Request**:
   - Escribe una descripción del PR, explicando los cambios que se hicieron en `feature1anthony`.
   - Asigna a otros miembros del equipo para que revisen el PR (si estás trabajando en equipo).
   - Una vez listo, haz clic en *Create Pull Request*.

4. **Revisión y Comentarios**:
   - Los compañeros pueden revisar el PR, dejar comentarios y, si encuentran algún problema, solicitar cambios.
   - Realiza los cambios necesarios en `feature1anthony` y vuelve a hacer *commit* y *push* para que se actualice el PR automáticamente.

5. **Hacer Merge del Pull Request**:
   - Cuando el PR esté aprobado, GitHub te dará la opción de *Merge Pull Request*.
   - Haz clic en esta opción para fusionar los cambios de `feature1anthony` en `developer`.
   - Opcionalmente, después del merge, puedes eliminar la rama `feature1anthony` desde GitHub para mantener el repositorio limpio.

### Ventajas de Usar Pull Requests
- **Revisión y control de calidad**: Los cambios pasan por revisión antes de integrarse en `developer`.
- **Historial claro**: El PR registra una discusión sobre los cambios, lo cual es útil para futuras referencias.
- **Evita conflictos**: Facilita la resolución de conflictos al tener un control más preciso sobre los cambios que se integran.

Utilizar *Pull Requests* es una práctica recomendada en casi todos los flujos de trabajo colaborativos en GitHub, ya que mejora la colaboración y asegura la calidad del código.
## 5 Como resolver conflictos al hacer Pull Request Merge

Resolver conflictos durante un *Pull Request (PR)* es un paso común y necesario cuando dos o más personas han trabajado en las mismas líneas o archivos del código.

### 1. Identificar el Conflicto en GitHub
Cuando GitHub detecta un conflicto al intentar fusionar el PR, mostrará un mensaje en la página del PR indicando que no puede hacer el *merge* automáticamente. Verás un botón que dice **Resolve conflicts** o **Resolver conflictos**.

### 2. Revisar el Conflicto
Haz clic en **Resolve conflicts**. GitHub te mostrará el archivo en conflicto con una estructura que indica las diferencias:

```plaintext
<<<<<<<<< HEAD
(código en la rama de destino)
=========
(código en la rama del PR)
>>>>>>>>> feature1anthony
```

Aquí:
- `<<<<<<<<< HEAD` muestra el contenido actual en la rama de destino (por ejemplo, `developer`).
- `========= ` separa el contenido de la rama en conflicto (por ejemplo, `feature1anthony`).
- `>>>>>>>>> feature1anthony` indica el final del contenido de la rama del PR.

### 3. Editar el Archivo para Resolver el Conflicto
1. Decide cuál de los cambios mantener: el de la rama de destino, el de la rama del PR o ambos, integrándolos si es necesario.
2. Elimina las marcas de conflicto (`<<<<<<<<<`, `=========`, `>>>>>>>>>`) y ajusta el código según tu elección.
3. Asegúrate de que el archivo esté limpio y funcione correctamente después de la edición.

### 4. Marcar el Conflicto como Resuelto y Confirmar los Cambios
1. Cuando hayas resuelto todos los conflictos en el archivo, selecciona **Mark as resolved** o **Marcar como resuelto** en GitHub.
2. Luego, selecciona **Commit merge** para guardar la resolución.

### 5. Comprobación Final y Fusión del Pull Request
1. Vuelve al PR y revisa que todos los conflictos estén resueltos. GitHub debería ahora permitirte hacer el *merge* del PR.
2. Haz clic en **Merge pull request** para finalizar la fusión de la rama.

### Alternativa: Resolver Conflictos Localmente
Si el conflicto es complejo, puedes resolverlo localmente:

1. Haz un *pull* de la rama de destino en tu entorno local.
2. Haz el *merge* de tu rama de trabajo y resuelve los conflictos en tu editor de código.
3. Haz un *commit* con los cambios resueltos y luego un *push* a tu rama en GitHub. Esto actualizará el PR con los conflictos resueltos.

Siguiendo estos pasos, podrás resolver los conflictos de manera efectiva y sin problemas al hacer un *Pull Request*.



## 6. Recursos para Aprender más sobre GitHub

Para aprender Git y GitHub, puedes usar estos recursos:

1. **GitHub Docs en Español**: [GitHub Docs](https://docs.github.com/es) tiene una sección en español con guías oficiales y buenas prácticas.

2. **CódigoFacilito**: [CódigoFacilito](https://codigofacilito.com/cursos/git) tiene lecciones prácticas en español para comprender conceptos esenciales de Git y GitHub.
3. **Pro Git - Libro en Español**: [Pro Git](https://git-scm.com/book/es/v2) es un libro gratuito que cubre desde lo básico hasta lo avanzado de Git.



## ✨ Desarrollado por
[Anthony](https://github.com/usuario_anthony) 👨‍💻 | [Alain](https://github.com/usuario_alain) 👨‍💻 | [Clara](https://github.com/usuario_clara) 👩‍💻 | [Asier](https://github.com/usuario_asier) 👨‍💻

---


> _“Este proyecto fue una gran oportunidad para aprender y mejorar nuestras habilidades en Java y en la colaboración usando GitHub. Trabajar en equipo nos permitió comprender la importancia de un flujo de trabajo estructurado y de las revisiones de código, lo cual fue clave para lograr una aplicación de calidad. Nos llevamos una valiosa experiencia en desarrollo colaborativo que sin duda aplicaremos en futuros proyectos.”_

