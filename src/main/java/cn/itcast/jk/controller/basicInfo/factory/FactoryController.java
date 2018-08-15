package cn.itcast.jk.controller.basicInfo.factory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.jk.controller.BaseController;
import cn.itcast.jk.pojo.FactoryC;
import cn.itcast.jk.service.FactoryService;

@Controller
public class FactoryController extends BaseController{
	
	@Autowired
	private FactoryService factoryService;
	@RequestMapping("/basicinfo/factory/list.action")
	public String list(Model model){
		List<FactoryC> datalist = factoryService.find(null);
		model.addAttribute("dataList", datalist);
		
		return "/basicinfo/factory/jFactoryList.jsp";
		
	}
	@RequestMapping("/basicinfo/factory/toInsert.action")
	public String toInsert(){
		return "/basicinfo/factory/jFactoryInsert.jsp";
	}
	@RequestMapping("/basicinfo/factory/insert.action")
	public String insert(FactoryC factory){
		factoryService.insert(factory);
		return "redirect:/basicinfo/factory/list.action";
		
	}

}
