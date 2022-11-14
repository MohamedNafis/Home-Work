package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal(); // Hierarchical inheritance ex: Mammal, Reptile, Bird Extends Animal.
		animal.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mammalInfo(); // Single' inheritance ex: Mammal Extends Animal.
		mammal.animalInfo();

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo(); // Multilevel inheritance ex: BullDog Extends Dog, Dog Extends Mammal, and Mammal Extend Animal.
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
