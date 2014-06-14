package pouring

object Test {
	val problem = new Pouring(Vector(4,7))
	print(problem.moves)
	
	problem.solution(6)
}