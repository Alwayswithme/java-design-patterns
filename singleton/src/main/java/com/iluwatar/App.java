package com.iluwatar;

/**
 *
 * Singleton pattern ensures that the class (IvoryTower) can have only one
 * existing instance and provides global access to that instance.
 *
 * http://stackoverflow.com/questions/70689/what-is-an-efficient-way-to-implement-a-singleton-pattern-in-java
 *
 */
public class App {

	public static void main(String[] args) {

		IvoryTower ivoryTower1 = IvoryTower.getInstance();
		IvoryTower ivoryTower2 = IvoryTower.getInstance();
		System.out.println("ivoryTower1=" + ivoryTower1);
		System.out.println("ivoryTower2=" + ivoryTower2);

		ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower
				.getInstance();
		ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower
				.getInstance();
		System.out.println("threadSafeIvoryTower1=" + threadSafeIvoryTower1);
		System.out.println("threadSafeIvoryTower2=" + threadSafeIvoryTower2);

		EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
		EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
		System.out.println("enumIvoryTower1=" + enumIvoryTower1);
		System.out.println("enumIvoryTower2=" + enumIvoryTower2);
	}
}
