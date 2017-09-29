package com.huiji.comic.bobcat.huijicomics.utils;

import com.huiji.comic.bobcat.huijicomics.bean.ComicDataBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HeYongchen on 2017/7/27.
 */

public class InitComicsList {
    private static List<String> comicIdList = null;
    private static ArrayList<ComicDataBean> comicDataBeanList = null;

    public static void setComicDataBeanList(ArrayList<ComicDataBean> mComicDataBeanList) {
        if (comicDataBeanList == null) {
            comicDataBeanList = new ArrayList<>();
        } else {
            comicDataBeanList.clear();
        }
        comicDataBeanList = mComicDataBeanList;
    }

    public static void clearComicDataBeanList() {
        if (comicDataBeanList == null) {
            comicDataBeanList = new ArrayList<>();
        }
        comicDataBeanList.clear();
    }

    public static ArrayList<ComicDataBean> getComicDataBeanList() {
        if (comicDataBeanList == null) {
            comicDataBeanList = new ArrayList<>();
        }
        return comicDataBeanList;
    }

    public static List<String> getComicIdList() {
        if (comicIdList == null) {
            comicIdList = new ArrayList<>();
        }
        comicIdList.clear();
        initComicIdList();
        return comicIdList;
    }

    private static void initComicIdList() {
        for (int i = 0; i < 4311; i++) {
            comicIdList.add(String.valueOf(1000000 + i));
        }
    }

}
