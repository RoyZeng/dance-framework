package idv.danceframework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import idv.danceframework.lo.PageResult;
import idv.danceframework.qo.PageRequest;
import idv.danceframework.test.Test;

public interface BaseFlow<Query,List> {

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	Test test();

	@RequestMapping("/list")
	String list();

	@RequestMapping(value = "/query", method = { RequestMethod.POST, RequestMethod.GET }, produces = "application/json")
	@ResponseBody
	PageResult<List> query(Query queryObject, PageRequest pageRequest);
}
