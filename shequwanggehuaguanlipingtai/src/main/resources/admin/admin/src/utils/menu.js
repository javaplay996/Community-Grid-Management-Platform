const menu = {
    list() {
        return [
    {
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"管理员管理",
                        "menuJump":"列表",
                        "tableName":"users"
                    }
                ],
                "menu":"管理员管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"单位类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryDanwei"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"单位管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryDanweileixing"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"帖子类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryForum"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"公告类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryGonggao"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"科目管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryKemu"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"商业门店类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryShangyemendian"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"人口状况管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryShenti"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"小区管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryXiaoqu"
                    }
                ],
                "menu":"基础数据管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"论坛管理",
                        "menuJump":"列表",
                        "tableName":"forum"
                    }
                ],
                "menu":"论坛管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"公告管理",
                        "menuJump":"列表",
                        "tableName":"gonggao"
                    }
                ],
                "menu":"公告管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"意见征集管理",
                        "menuJump":"列表",
                        "tableName":"liuyan"
                    }
                ],
                "menu":"意见征集管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"商业门店管理",
                        "menuJump":"列表",
                        "tableName":"shangyemendian"
                    }
                ],
                "menu":"商业门店管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "报表",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"单位管理",
                        "menuJump":"列表",
                        "tableName":"danwei"
                    }
                ],
                "menu":"单位管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "报表",
                            "修改",
                            "删除"
                        ],
                        "menu":"用户管理",
                        "menuJump":"列表",
                        "tableName":"yonghu"
                    }
                ],
                "menu":"用户管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "添加考题",
                            "删除"
                        ],
                        "menu":"问卷调查管理",
                        "menuJump":"列表",
                        "tableName":"exampaper"
                    }
                ],
                "menu":"问卷调查管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"试题管理",
                        "menuJump":"列表",
                        "tableName":"examquestion"
                    }
                ],
                "menu":"试题管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "删除"
                        ],
                        "menu":"调查记录",
                        "menuJump":"列表",
                        "tableName":"examrecord"
                    }
                ],
                "menu":"调查记录管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"轮播图管理",
                        "menuJump":"列表",
                        "tableName":"config"
                    }
                ],
                "menu":"轮播图信息"
            }
        ],
        "frontMenu":[],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    }
]
    }
}
export default menu;