
## Instrucciones para Clonar y Cambiar la URL del Repositorio

### Clonar el Repositorio Original

1. Abre una terminal o línea de comandos en tu computadora.

2. Navega al directorio donde deseas clonar el repositorio usando el comando `cd`. Por ejemplo:

   ```bash
   cd path/to/your/folder
   ```

3. Utiliza el comando `git clone` seguido de la URL del repositorio que deseas clonar. Por ejemplo:

   ```bash
   git clone https://github.com/usuario/repositorio.git
   ```

   Para este repositorio en concreto: 

    ```bash
   git clone https://github.com/PabloT18/icc-estructura-01-ejercicios.git
   ```



   Este comando copia todo el contenido del repositorio en GitHub a tu computadora local.

### Cambiar la URL del Repositorio para Subir a Tu Propio Repositorio

Una vez que hayas clonado el repositorio y hecho los cambios deseados, puedes subirlo a tu propio repositorio en GitHub. Para ello, primero necesitas cambiar la URL remota a la URL de tu propio repositorio.

1. Crea un nuevo repositorio en tu cuenta de GitHub. No inicialices el repositorio con un README, .gitignore, o licencia ya que clonarás un repositorio que ya tiene contenido.

2. En la terminal, navega al directorio del repositorio clonado si aún no lo has hecho. Usa `cd` para cambiar al directorio del repositorio clonado.

   ```bash
   cd repositorio-clonado
   ```

3. Usa el comando `git remote set-url` para cambiar la URL del repositorio remoto a tu nuevo repositorio en GitHub. Asegúrate de reemplazar `https://github.com/tu-usuario/tu-repositorio.git` con la URL de tu repositorio.

   ```bash
   git remote set-url origin https://github.com/tu-usuario/tu-repositorio.git
   ```

   Este comando cambia la URL remota del repositorio clonado a la URL de tu nuevo repositorio en GitHub.

### Subir el Repositorio a Tu Cuenta de GitHub

Ahora que la URL remota apunta a tu repositorio, puedes subir los cambios.

1. Añade todos los cambios al área de preparación usando el comando `git add`.

   ```bash
   git add .
   ```

2. Crea un commit con tus cambios. Asegúrate de proporcionar un mensaje de commit descriptivo.

   ```bash
   git commit -m "Descripción de los cambios realizados"
   ```

3. Finalmente, sube tu código a GitHub con el comando `git push`.

   ```bash
   git push origin main
   ```

   Asegúrate de que `main` sea la rama correcta a la que deseas subir. Si la rama principal de tu repositorio tiene un nombre diferente, reemplaza `main` con el nombre correspondiente.

