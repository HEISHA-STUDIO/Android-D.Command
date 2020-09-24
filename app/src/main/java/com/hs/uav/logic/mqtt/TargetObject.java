package com.hs.uav.logic.mqtt;

//@ParsePacket("header:1|cmd:2|len:2|seq:2|mac:6|data:this.len-6|check:1|tail:1")
public class TargetObject {
    public byte header;
    public short cmd;
    public short len;
    public short seq;
    public byte[] mac;
    public byte[] data;
    public byte check;
    public byte tail;
}