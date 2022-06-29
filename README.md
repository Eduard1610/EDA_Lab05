<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Árboles</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>05</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>20-Jun-2022</td><td>FECHA FIN:</td><td>24-Jun-2022</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="6">Integrantes:
    <ul>
        <li>Durand Obando, Eduardo Franshu</li>
        <li>Galvez Quilla, Henry Isaias</li>
        <li>Alvarez Astete, Kevin Jheeremy</li>
</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

# Árboles

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

#

## OBJETIVOS TEMAS Y COMPETENCIAS

### OBJETIVOS

- Estudiar arboles.

### TEMAS
-   Definiciones de árboles.
-   Operaciones con árboles.

<details>
<summary>COMPETENCIAS</summary>

- C.m. Construye responsablemente soluciones haciendo uso de estructuras de datos y algoritmos, siguiendo un proceso adecuado para resolver problemas computacionales que se ajustan al uso de los recursos disponibles y a especificaciones concretas.

</details>

## EJERCICIOS PROPUESTOS

-   5.1 Corchetes equilibrados

    - Para su solucion se tomo como base que las cadenas deberian tener una longitud par, caso contrario nunca podrian estar balanceadas. A partir de ello es que se decidio ir eliminando de la cadena principal "s" las siguientes subcadenas: "{}" , "[]" , "()". De tal forma que en caso de que la cadena principal "s" quedase sin caracteres significaria que se trata de un conjunto de corchetes equilibrados, caso contrario se continuaria intentando eliminar un numero de veces igual a la mitad de la longitud de la cadena "s". 


# -  5.2 Operaciones de árbol AVL
    -   Simule las siguientes operaciones de un árbol AVL
    
   # Inserción
    - 1. Inserción: 100 - 200 - 300 - 400 - 500 - 50 - 25 - 350 - 375 - 360 - 355 - 150 - 175 - 120 - 190.
    
   ## Inserción de 100
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_1.jpg?raw=true"/>  
   Se hace la inserción del root
   
   ## Inserción de 200
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_2.jpg?raw=true"/>    
   Se hace la inserción en el subnodo derecho 
   
   ## Inserción de 300
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_3.1.jpg?raw=true"/>  
   Se hace la inserción en el subarbol derecho  
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_3.2.jpg?raw=true"/>  
   Se hace rotación simple a la izquierda para compensar equilibrio
   
   ## Inserción de 400
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_4.jpg?raw=true"/>  
   Se hace la inserción en el subarbol derecho 
   
   ## Inserción de 500
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_5.1.jpg?raw=true"/>  
   Se hace la inserción en el subnodo derecho  
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_5.2.jpg?raw=true"/>  
   Se hace rotación simple a la izquierda para compensar equilibrio
   
   ## Inserción de 50
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_6.jpg?raw=true"/>  
   Se hace la inserción en el subarbol izquierdo  
   
   ## Inserción de 25
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_7.1.jpg?raw=true"/>  
   Se hace la inserción en el subarbol izquierdo  
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_7.2.jpg?raw=true"/>  
   Se hace rotación simple a la derecha para compensar equilibrio
   
   ## Inserción de 350
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_8.jpg?raw=true"/>  
   Se hace la inserción en el subarbol derecho
   
   ## Inserción de 375
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_9.1.jpg?raw=true"/>  
   Se hace la inserción en el subarbol izquierdo  
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_9.2.jpg?raw=true"/>  
   Se hace rotación simple a la izquierda para compensar equilibrio
   
  ## Inserción de 360
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_10.1.jpg?raw=true"/>  
   Se hace la inserción en el subarbol izquierdo  
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_10.2.jpg?raw=true"/>  
   Se hace rotación doble a la derecha para compensar equilibrio
   
   ## Inserción de 355
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_11.1.jpg?raw=true"/>  
   Se hace la inserción en el subarbol izquierdo  
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_11.2.jpg?raw=true"/>  
   Se hace rotación doble a la izquierda para compensar equilibrio
   
   ## Inserción de 150
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_12.jpg?raw=true"/>  
   Se hace la inserción en el subarbol derecho  
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_12.2.jpg?raw=true"/>  
   Se hace rotación doble a la derecha para compensar equilibrio
   
   ## Inserción de 175
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_13.jpg?raw=true"/>  
   Se hace la inserción en el subarbol derecho
   
   ## Inserción de 120
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_14.jpg?raw=true"/>  
   Se hace la inserción en el subarbol izquierdo
    
   ## Inserción de 190
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_15.1.jpg?raw=true"/>  
   Se hace la inserción en el subarbol derecho
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Insercion/_15.2.jpg?raw=true"/>  
   Se hace rotación doble a la derecha para compensar equilibrio
   
   # Eliminacion
    - 2. Después de crear un árbol AVL, realice la eliminación: 100 - 200 - 300 - 400 - 500 - 50 - 25 - 350 - 375 - 360 - 355 - 150 - 175 - 120 - 190.
    
   ## Eliminacion de 100
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_1.1.jpg?raw=true"/>  
   Se hace la eliminacion y sube el subarbol izquierdo  
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_1.2.jpg?raw=true"/>  
   Se hace rotación simple a la izquierda para compensar equilibrio  
   
   ## Eliminacion de 200
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_2.jpg?raw=true"/>  
   Se hace la eliminacion y sube el subarbol izquierdo  
   
   ## Eliminacion de 300
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_3.1.jpg?raw=true"/>  
   Se hace la eliminacion 
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_3.2.jpg?raw=true"/>  
   Se hace rotación doble a la derecha para compensar equilibrio  
   
   ## Eliminacion de 400
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_4.jpg?raw=true"/>  
   Se hace la eliminacion y sube el subarbol derecho  
   
   ## Eliminacion de 500
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_5.1.jpg?raw=true"/>  
   Se hace la eliminacion
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_5.2.jpg?raw=true"/>  
   Se hace rotación simple a la derecha para compensar equilibrio  
   
   ## Eliminacion de 50
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_6.jpg?raw=true"/>  
   Se hace la eliminacion y sube el subarbol izquierdo  
   
   ## Eliminacion de 25
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_7.jpg?raw=true"/>  
   Se hace la eliminacion y sube el subarbol derecho
   
   ## Eliminacion de 350
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_8.jpg?raw=true"/>  
   Se hace la eliminacion de la raíz y sube su antecesor
  
  ## Eliminacion de 375
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_9.jpg?raw=true"/>  
   Se hace la eliminacion
   
   ## Eliminacion de 360
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_10.jpg?raw=true"/>  
   Se hace la eliminacion y sube el subarbol izquierdo  
   
   ## Eliminacion de 355
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_11.1.jpg?raw=true"/>  
   Se hace la eliminacion
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_11.2.jpg?raw=true"/>  
   Se hace rotación simple a la derecha para compensar equilibrio  
   
   ## Eliminacion de 150
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_12.1.jpg?raw=true"/>  
   Se hace la eliminacion y sube el subarbol izquierdo  
    <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_12.2.jpg?raw=true"/>  
   Se hace rotación doble a la izquierda para compensar equilibrio  
   
   ## Eliminacion de 175
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_13.jpg?raw=true"/>  
   Se hace la eliminacion y sube el subarbol izquierdo  
   
   ## Eliminacion de 120
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_14.jpg?raw=true"/>  
   Se hace la eliminacion y sube el subarbol derecho  
   
   ## Eliminacion de 190
   Se hace la eliminacion y el árbol queda vacío  
   <img src="https://github.com/Eduard1610/EDA_Lab05/blob/main/5.2_OperacionesAVL/Eliminacion/_15.jpg?raw=true"/>  
   
   
   
-   5.3 Árbol AVL
    -   Implementa un AVL con tipos genéricos siguiendo las interfaces
    -   ¿Cómo empezar?
    -   (i) Implemente una clase Node<T> donde T es un tipo genérico, esta clase debe contener al menos el  siguientes propiedades.
        -   Para obtener más información sobre la verificación genérica: https://docs.oracle.com/javase/tutorial/java/generics/types.html
        -   1. Datos T: la información almacenada en el nodo.
        -   2. Node<T> rightNode: una referencia al siguiente nodo.
        -   3. Node<T> leftNode: una referencia al nodo anterior.
        -   4. Int balanceFactor: el factor de equilibrio del nodo.
    -   (ii) Implemente las clases AVLTree<T> que deben contener al menos estas propiedades
        -   1. Node<T> root: la referencia sobre el nodo inicial.
    -   (iii) Lectura sugerida:
        -   https://algorithmtutor.com/Data-Structures/Tree/AVL-Trees/


## REFERENCIAS
    - https://www.w3schools.com/java/
    - https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
    -   https://algorithmtutor.com/Data-Structures/Tree/AVL-Trees/
    -   https://docs.oracle.com/javase/tutorial/java/generics/types.html

#

[license]: https://img.shields.io/github/license/rescobedoq/pw2?label=rescobedoq
[license-file]: https://github.com/rescobedoq/pw2/blob/main/LICENSE

[downloads]: https://img.shields.io/github/downloads/rescobedoq/pw2/total?label=Downloads
[releases]: https://github.com/rescobedoq/pw2/releases/

[last-commit]: https://img.shields.io/github/last-commit/rescobedoq/pw2?label=Last%20Commit

[Debian]: https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white
[debian-site]: https://www.debian.org/index.es.html

[Git]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white
[git-site]: https://git-scm.com/

[GitHub]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[github-site]: https://github.com/

[Vim]: https://img.shields.io/badge/VIM-%2311AB00.svg?style=for-the-badge&logo=vim&logoColor=white
[vim-site]: https://www.vim.org/

[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white
[java-site]: https://docs.oracle.com/javase/tutorial/


[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]
