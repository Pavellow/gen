import math

class Noeud():
	def __init__(self, G, D, num = math.inf, val = math.inf):
		self.G = G
		self.D = D
		self.val = val
		self.num = num
		
	def isFeuille(self):
		if (self.G == None) and (self.D == None):
			return True
		return False
		
	def successeurs(self):
		return 
V = [7, 9, 5, 4, 11, 13, 4, 17, 5, 9, 4, 2, 11, 1, 13, 6]

def create_tree():
	num = 1
	arbre = []
	for val in V:
		arbre.append(Noeud(None, None, num, val))
	while len(arbre) > 1:	
		nb = len(arbre)
		for i in range(0, nb, 2):
			ndG = arbre.pop(0)
			ndD = None
			if (i+1) < nb:
				ndD = arbre.pop(0)
			abre.append(Noeud(ndG, ndD, num))
			num += 1
	return arbre[0]

def elagage(Nd, Depth, Alpha, Beta):
	if(Nd.isFeuille == True):
		return Nd.val
	if(Depth % 2 == 0):
		MaxValue = -math.inf
		for s in 

nd = create_tree()
print(arbre[0])
