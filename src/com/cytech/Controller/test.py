from numpy.core.multiarray import zeros
from numpy.core.multiarray import zeros
from numpy.lib.function_base import kaiser
from matplotlib.font_manager import X11FontDirectories
#Python:
import numpy as np 
from numpy import zeros, linspace
from numpy.random import rand
from math import *
import matplotlib.pyplot as plt
import matplotlib.colors as colors


lmd = 5
Nmc = 100
def Box_muller():
  u1=rand()
  x = -1/2*np.log(1-u1)
  return x

def Chaine_valeurs_Muller(lmd,Nmc):
  x = zeros(Nmc)
  y= zeros(Nmc)
  for i in range(0,Nmc):
    y[i]=Box_muller()
  return (x,y)

X = Chaine_valeurs_Muller(lmd,Nmc)[0]
Y =Chaine_valeurs_Muller(lmd,Nmc)[1]

a=-3
delta=0.07
sigma =1
beta = 2
lmd = 5




def Integrale(n):
  integrale = 0
  for i in range(1,n):
    integrale = integrale + np.exp(-(X[i]**2/2))/2*np.sqrt(2*np.pi)
  integrale = integrale/n
  return integrale


Integrale(100)

def Convergence():
  test = []
  valeurs=zeros(Nmc)
  x = zeros(Nmc)
  for i in range (Nmc):
    test.append(7.39)
  for i in range(0,Nmc):
    x[i]=a+delta *i
  for n in range(1,Nmc):
    valeurs[n]=Integrale(n)
  fig = plt.figure()
  plt.plot(x,valeurs)
  
Convergence()