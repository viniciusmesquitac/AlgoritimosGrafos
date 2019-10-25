import Graph


def main():
    vertices = ['a', 'b', 'c', 'd']
    edges = [('a','b'),('a','c'),('b','c')]
    graph = Graph.Graph(vertices, edges, False)
    graph.get_matrix_of_adjacencie()


if __name__ == '__main__':
    main()