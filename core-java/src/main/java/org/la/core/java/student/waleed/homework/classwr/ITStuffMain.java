package org.la.core.java.student.waleed.homework.classwr;

import java.util.List;

import org.la.core.java.jawed.common.Constants;


import org.la.core.java.jawed.util.GSONGenericUtil;
import org.la.core.java.student.waleed.homework.classwr.model.ITStuff;

/**
 * @author Waleed Rizq
 *
 * @date Mar 12, 2022
 */
public class ITStuffMain {

	
	public static void main(String[] args) {
		
		
		conversionByGSONGeneric();
		
		
		
	}
		
		
		
		

		//using gson data conversion from User to User using generic
		public static void conversionByGSONGeneric() {
			List<ITStuff> list= GSONGenericUtil.getList(Constants.ITSTUFF_LIST_FILE_NAME, ITStuff [].class);
			System.out.println("by gson:"+list);
		}
		

	}


