package com.projecthive.backend.services;

import java.util.List;

import com.projecthive.backend.payloads.CategoryDto;

public interface CategoryService {

	CategoryDto createCategory(CategoryDto categoryDto);

	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// delete
	void deleteCategory(Integer categoryId);

	// get
	CategoryDto getCategory(Integer categoryId);

	// get All

	List<CategoryDto> getCategories();
}
