precios = {1: 20, 2: 40, 3: 60, 4: 80, 5: 100, 6: 120}
print("Promocion si la compra supera el valor de 200 se aplicara el un descuento del 10% :)")
prc1 = int(input("Ingrese el número del primer producto que desea comprar (1-6): "))
prc2 = int(input("Ingrese el número del segundo producto que desea comprar (1-6): "))
prc3 = int(input("Ingrese el número del tercer producto que desea comprar (1-6): "))

precio1 = precios.get(prc1, 0)
precio2 = precios.get(prc2, 0)
precio3 = precios.get(prc3, 0)

suma = precio1 + precio2 + precio3
print("El precio total de su compra es:", suma)

if (suma >= 200):
    descuento = 10
    descuento_total = suma (descuento/100)
    valor_descuento = suma- valor_descuento
    print("El precio total de su compra con descuento es:",valor_descuento)
else:
        
     print("El precio total de su compra es:", suma)