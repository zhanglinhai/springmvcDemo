package com.enn.ennew.webapps.operator.controller;

import com.enn.ennew.core.bean.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/activity")
public class ActivityController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @return
     */
    @RequestMapping(value = "/toDemoPage", method = RequestMethod.GET)
    public ModelAndView toSelectActive() {
    	 Map<String, Object> paramMap = new HashMap<String, Object>();
         return new ModelAndView("/demoPage", paramMap);
    }
    

}
