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
    
def Buscar(data, a):        #Metodo para buscar en la matriz
  for i in range(78):           #definimos un ciclo que recorra las columnas de la matriz, le damos valor de 78 ya que el ciclo no accede al elemento dado
    if (data[0],[i] == a):      #comparamos el valor hallado en la columna i con el valor de a
      return i              #si el valor es el mismo retornamos i 
    else
      return "Error, elemento no encontrado"  #si no es el mismo retornamos un error 
    
def Persona(data, b):   #Metodo para acceder a los datos de una persona 
  return data[b]          

def Categoria(data, b, c):  #Metodo para acceder al resultado de una persona en una categoria 
  d = Buscar(data,c)
  return data[b,d]
