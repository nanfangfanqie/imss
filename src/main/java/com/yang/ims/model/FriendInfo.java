package com.yang.ims.model;

public class FriendInfo {

    private Long fid;
    private Long mid;
    private int index;
    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }


    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public FriendInfo(Long fid, int index, Long mid) {
        this.fid = fid;
        this.mid = mid;
        this.index = index;
    }
}
