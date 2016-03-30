package com.jl.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "indigo:indeximageset")
@Node(jcrType = "indigo:indeximageset")
public class Indeximageset extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "indigo:small")
    public HippoGalleryImageBean getSmall() {
        return getBean("indigo:small", HippoGalleryImageBean.class);
    }
}
