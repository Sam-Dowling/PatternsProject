class UDPPacketType implements PacketType{

    @Override
    public String packData(String data) {
        return String.format(":UDP:%s:UDP:", data);
    }

    @Override
    public String unpackData(String data) {
        return data.replaceAll(":UDP:", "");
    }
}