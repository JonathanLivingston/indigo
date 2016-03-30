package com.jl.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import com.jl.beans.Indeximageset;

@HippoEssentialsGenerated(internalName = "indigo:bannerdocument")
@Node(jcrType = "indigo:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "indigo:title")
    public String getTitle() {
        return getProperty("indigo:title");
    }

    @HippoEssentialsGenerated(internalName = "indigo:content")
    public HippoHtml getContent() {
        return getHippoHtml("indigo:content");
    }

    @HippoEssentialsGenerated(internalName = "indigo:link")
    public HippoBean getLink() {
        return getLinkedBean("indigo:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "indigo:image")
    public Indeximageset getImage() {
        return getLinkedBean("indigo:image", Indeximageset.class);
    }
}
