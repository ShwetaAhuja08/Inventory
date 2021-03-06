package com.cg.inventory.services;

import java.util.List;

import com.cg.inventory.model.Category;

/**
 * This is an interface for CategoryService class, it has all the abstract
 * methods
 * 
 * @author abhiram
 *
 */
public interface CategoryService {

	/**
	 * This method returns list of all categories
	 * 
	 * @return list of categories
	 */
	List<Category> viewAllCategories();

	/**
	 * This method takes category details and creates a new category for products
	 * 
	 * @param category
	 * @return category entity details
	 */
	Category createCategory(Category category);

	/**
	 * This method takes category Id and deletes the category
	 * 
	 * @param categoryId
	 */
	void deleteCategory(Long categoryId);

	/**
	 * This method returns categories by searching with specific category Id
	 * 
	 * @param categoryId
	 * @return category details if found or else throw exception
	 */
	Category viewCategoryById(Long categoryId);

	/**
	 * This method updates category details by searching with category Id
	 * 
	 * @param categoryId
	 * @param category
	 * @return category details if found or else throw exception
	 */
	Category updateCategory(Long categoryId, Category category);

}