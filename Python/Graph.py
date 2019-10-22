'''
Project: Building a Graph with python
@author: João Victor
Created: 22/10/2019
'''
from collections import defaultdict


class Graph(object):
    
    __slots__ = ['vertices', 'edges', 'is_oriented', 'list_of_adjacencies']


    def __init__(self, vertices, edges = None, is_oriented = False):
        self.vertices = vertices
        self.edges = set(edges) if edges != None else None
        self.is_oriented = is_oriented
        self._get_list_of_adjacencies_()


    def _get_list_of_adjacencies_(self):
        self.list_of_adjacencies = defaultdict(list)
        for v in self.vertices:
            filter_list = list(
                filter(lambda e: self._filter_adjacencie_(v, e), self.edges)
            )        
            
            if filter_list == []:
                self.list_of_adjacencies[v] = []  
            else: 
                [self.list_of_adjacencies[v].append(e[1]) for e in filter_list]

            
    
    def _filter_adjacencie_(self, vertice , edge):
        if vertice == edge[0]:
            return edge[1]
        