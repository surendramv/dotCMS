package com.dotmarketing.viewtools;

import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.tools.ViewTool;

import com.dotmarketing.cms.virtualtour.factories.VirtualTourFactory;

public class VirtualTourWebAPI implements ViewTool {

	Context ctx;

	public void init(Object obj) {
	}

    public String getBuildingListXML (String type) {
        return VirtualTourFactory.getBuildingListXML(type);
    }

    public String getBuildingTypesXML () {
        return VirtualTourFactory.getBuildingTypesXML();
    }
        
    public String getBuildingDetailXML (String id) 
    {
    	int thumbW = 94;
    	int thumbH = 94;
    	int photoW = 350;
    	int photoH = 350;
        return getBuildingDetailXML(id,thumbW,thumbH,photoW,photoH);
    }
    
    public String getBuildingDetailXML (String id,int thumbW,int thumbH,int photoW,int photoH) 
    {
        return VirtualTourFactory.getBuildingDetailXML(id,thumbW,thumbH,photoW,photoH);
    }

}