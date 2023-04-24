edad_como_cadena = input("Dime tu edad: ")

edad = int(edad_como_cadena)

if edad >= 0 and edad <= 2:
    print("Eres un Bebé")
elif edad >= 3 and edad <= 11:
    print("Eres un Niño")
elif edad >= 12 and edad <= 17:
    print("Adolescente")  
elif edad >= 18 and edad <= 34:
    print("Adulto")
elif edad == 35:
    print(" Felicidades Te llamas Máximo Décimo Meridio, comandante de los ejércitos del norte, general de las legiones fénix, leal servidor del verdadero emperador Marco Aurelio, padre de un hijo asesinado, marido de una mujer asesinada, y alcanzaras tu venganza, en esta vida o en la otra.") 
elif edad >=36 and edad <= 64:
    print("Adulto")      
elif edad >= 65 and edad<= 114:
    print("Anciano")
elif edad >= 115:
    print("Eres una Momia")