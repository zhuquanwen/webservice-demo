package com.zqw.test.cxf.service;

import com.zqw.test.cxf.model.Demo;

import javax.ws.rs.*;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/10 19:39
 * @since jdk1.8
 */
@Path("/demoservice")
public interface IDemoService {
    /**
     * 客户服务:根据id查询
     */
    @Path("/find/{id}")
    @GET
    @Produces({"application/xml", "application/json"})
    Demo findById(@PathParam("id") Integer id);

    @Path("/delete/{id}")
    @DELETE
    @Produces({"application/xml", "application/json"})
    boolean deleteById(@QueryParam("id") Integer id);

    @Path("/add")
    @PUT
    @Produces({"application/xml", "application/json"})
    boolean add(@FormParam("id") Integer id, @FormParam("name") String name);

    @Path("/edit")
    @PUT
    @Produces({"application/xml", "application/json"})
    boolean edit(@FormParam("id") Integer id, @FormParam("name") String name);

}
