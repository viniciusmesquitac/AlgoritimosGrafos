import Graph


def main():
    vertices = ['a', 'b', 'c', 'd']
    edges = [('a','b'),('a','c'),('b','c'),('c','b')]
    graph = Graph.Graph(vertices, edges, True)



if __name__ == '__main__':
    main()