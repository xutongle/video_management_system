package com.adp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adp.model.Algorithm;
import com.adp.model.Video;
import com.adp.service.AlgorithmManager;
import com.adp.service.VideoManager;

@Controller
public class AlgorithmController {
	
	@Autowired(required=true)
	VideoManager vm;

	@Autowired(required=true)
	AlgorithmManager am;
	
	/**********************************视频场景分割页面（Trial+Pro）********************************/
	@RequestMapping(value="loadImageProcess4Trial_keyFrameSegmentation")
	public ModelAndView loadImageProcess4Trial_keyFrameSegmentation(@RequestParam("videoID") int videoID){
		ModelAndView mv = new ModelAndView("ImageProcess4Trial_keyFrameSegmentation");
		Video video = vm.getVideoByVideoID(videoID);
		if(video != null){
			mv.addObject("video", video);
		}
		return mv;
	}
	
	@RequestMapping(value="ajax_imageProcess4Trial_keyFrameSegmentation")
	@ResponseBody
	public String ajax_imageProcess4Trial_keyFrameSegmentation( int videoID, int algorithmID){
		//视频场景分割代码block-start
		
		//视频场景分割代码block-end
		return ??;
	}
	
	@RequestMapping(value="ajax_loadImageProcess4Pro_keyFrameSegmentation")
	public ModelAndView ajax_loadImageProcess4Pro_keyFrameSegmentation(@RequestParam("videoID") int videoID){
		ModelAndView mv = new ModelAndView("ImageProcess4Trial_keyFrameSegmentation");
		Video video = vm.getVideoByVideoID(videoID);
		List<Algorithm> algorithms = am.getAlgorithmsByAlgorithmCategoryID(1);//视频分割算法类别的ID是1
		if(video != null && algorithms != null){
			mv.addObject("video", video);
			mv.addObject("algorithms", algorithms);
		}
		return mv;
	}
	
	@RequestMapping(value="ImageProcess4Pro_keyFrameSegmentation")
	@ResponseBody
	public String ImageProcess4Pro_keyFrameSegmentation(int videoID, int algorithmID){
	//视频场景风格代码
	return ??;
	}
	
	/**********************************关键帧提取页面（Trial+Pro）********************************/
	
	/**********************************目标对象提取页面（Trial+Pro）********************************/
	
	/**********************************高层语义对接页面（Trial+Pro）********************************/
	
}
