Una empresa de transporte necesita un sistema de consola 
para registrar y gestionar los vehículos de su flota, 
calculando el costo de mantenimiento de cada uno según su tipo.

Requisitos

1. Clase abstracta Vehiculo:
* Atributos private: placa (String), marca (String), kilometraje (double)
* Constructor con los 3 datos
* Getters y setters
* Método mostrarInformacion() que imprima placa, marca y kilometraje
* Método abstracto calcularCostoMantenimiento() que retorna double

2. Clase Camion (hereda de Vehiculo):
* Atributo adicional: capacidadCarga (double, en toneladas)
* Constructor con super(...)
* Sobrescribe calcularCostoMantenimiento(): (kilometraje * 0.15) + (capacidadCarga * 50)
* Sobrescribe mostrarInformacion() agregando la capacidad de carga

3. Clase Automovil (hereda de Vehiculo):
* Atributo adicional: numPasajeros (int)
* Constructor con super(...)
* Sobrescribe calcularCostoMantenimiento(): (kilometraje * 0.08) + (numPasajeros * 10)
* Sobrescribe mostrarInformacion() agregando el número de pasajeros

4. Clase Menu:
ArrayList<Vehiculo> flota
Menú con estas opciones:
      1. Registrar un camión
      2. Registrar un automóvil
      3. Mostrar todos los vehículos con su costo de mantenimiento
      4. Mostrar el costo total de mantenimiento de toda la flota
      5. Buscar un vehículo por placa
      6. Salir

* Opción 3: recorre la lista e imprime la información de 
cada vehículo junto a su costo de mantenimiento
* Opción 4: recorre la lista, suma el calcularCostoMantenimiento() 
de todos los vehículos, e imprime el total
* Opción 5: pide una placa por consola, recorre la lista comparando con 
.equals(), y si la encuentra muestra su información; si no, muestra un mensaje de que no existe