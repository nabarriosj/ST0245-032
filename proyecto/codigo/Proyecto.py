'''
@author: SantiagoMontoyaTobon - NelsonAndresBarrios
el siguiente codigo esta diseñado para leer un archivo con extension csv y organizarlos en un arreglo de arreglos tambien llamado matriz
'''
import csv        #importamos el modulo csv que cuenta con una funcion llamada reader que utilizaremos para leer los datos

def Lectura_Datos(archivo):      #definimos la funcion que utilizaremos para invocar el reader
  data = []
  with open(archivo, encoding = 'utf-8') as datos:    #abrimos el archivo y utilizamos el encoding para codificar cada caracter y hacerlo reconocible 
    leer = csv.reader(datos, delimiter=";")  #invocamos el metodo reader que recibe el archivo y como metodo opcional el delimitador, sacado de: https://code.tutsplus.com/es/tutorials/how-to-read-and-write-csv-files-in-python--cms-29907
    for line in leer:
      data.append(line)      #agregamos el item al final de la lista 
    print(data)
