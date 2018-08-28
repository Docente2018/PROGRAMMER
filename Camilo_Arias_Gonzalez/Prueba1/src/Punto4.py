# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class FiguraRegular:
    def __init__(self, lado = 3):
        self.lado = lado
        self.__area = 0
        
    def verArea(self):
        return self.area
    
class Triangulo(FiguraRegular):
    def __init__(self, lado, base, altura):
        self.lado = lado
        self.base = base
        self.altura = altura
        
    def calcularArea(self):
        self.area = (self.base * self.altura)/2
        print 'El area de este Triangulo es: '+ str(self.verArea())

class Cuadrado(FiguraRegular):
    def __init__(self, lado):
        self.lado = lado
        
    def calcularArea(self):
        self.area = self.lado**2
        print 'El area de este Cuadrado es: '+ str(self.verArea())
    
        
cuadrado = Cuadrado(2)
cuadrado.calcularArea()

triangulo = Triangulo(3,2,3)
triangulo.calcularArea()
