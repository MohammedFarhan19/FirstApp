package de.mohammed.firstapp.db.repoGeneric;

import java.util.List;

import de.mohammed.firstapp.db.entity.Category;

public class BaseRepo {

	
	public int insert(Object obj){
		if(obj instanceof Category) {
			Category cat = (Category) obj; // Casting
		} 
		throw new UnsupportedOperationException();
	}

	public int update(Object object){
		Class clazz = object.getClass();
		
//		if(object instanceof Category) {
//			Category cat = (Category) object; // Casting
//		} 
		throw new UnsupportedOperationException();
	}

	public int delete(Class clazz, Integer id){
		throw new UnsupportedOperationException();
	}

	public Object select(Class clazz, Integer id){
		throw new UnsupportedOperationException();
	}
	
	public List selectAll(Class clazz){
		throw new UnsupportedOperationException();
	}
	
	
	/**
	 * nur zum testen
	 * @param args
	 */
	public static void main(String[] args) {
//		BaseRepo baseRepo = new BaseRepo();
//		baseRepo.selectAll(Category.class);
		System.out.println(Category.class);
		System.out.println(Category.class.getName());
		System.out.println(Category.class.getSimpleName());
		System.out.println(Category.class.getSuperclass());
		
	}
}
