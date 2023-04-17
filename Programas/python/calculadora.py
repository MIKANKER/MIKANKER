num1 = int(input("Ingresa tu primer número: "))
operacion = input("Ingresa la operación que deseas realizar (+, -, *, /): ")
num2 = int(input("Ingresa tu segundo número: "))

if operacion == "+":
    print(num1 + num2)
elif operacion == "-":
    print(num1 - num2)
elif operacion == "*":
    print(num1 * num2)
elif operacion == "/":
    if num2 == 0:
        print("No se puede dividir entre cero")
    else:
        print(num1 / num2)
else:
    print("Operación inválida")