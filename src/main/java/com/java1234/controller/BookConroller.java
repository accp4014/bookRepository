package com.java1234.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java1234.dao.BookDao;
import com.java1234.entity.BookEntity;
import com.java1234.model.BookModel;

@Controller
public class BookConroller {

	@Resource
	private BookDao bookDao;
	
	@GetMapping("/hello")
	public String helloWord() {
		return "欢迎来到图书管理系统";
	}
	
	
	@RequestMapping("/list")
	public ModelAndView getBookList() {
		ModelAndView mav = new ModelAndView();
		List<BookEntity> list = bookDao.findAll();
		mav.addObject("bookList", list);
		mav.setViewName("booklist");
		return mav;
	}
	
	@PostMapping("/optionBook")
	public String optionBookModel(BookModel bookModel) {
		int flag = 0;
		if(bookModel == null) {
			flag = 1;
		}else {
			BookEntity bookEntity = new BookEntity();
			bookEntity.setId(Integer.parseInt(bookModel.getId()));
			bookEntity.setName(bookModel.getName());
			bookEntity.setAuthor(bookModel.getAuthor());
			try {
				bookDao.save(bookEntity);
			}catch(Exception e) {
				flag = 2;
			}
		}
		
		return "forward:/list";
	}
	
	@GetMapping("/preUpdate/{id}")
	public ModelAndView fowWordOptionPage(@PathVariable("id")Integer id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bookModel", bookDao.getById(id));
		mav.setViewName("bookUpdate");
		return mav;
	}
	
	@GetMapping("/deleteBook/{id}")
	public String deleteById(@PathVariable("id")Integer id) {
		bookDao.deleteById(id);
		return "forward:/list";
	}
}
