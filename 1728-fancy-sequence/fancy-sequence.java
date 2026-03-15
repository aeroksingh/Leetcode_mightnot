class Fancy {
    long mod = 1_000_000_007;
    List<Long> list;
    long add = 0;
    long mul = 1;

    public Fancy() {
        list = new ArrayList<>();
    }

    long power(long a, long b){
        long res = 1;
        a %= mod;

        while(b > 0){
            if((b & 1) == 1)
                res = (res * a) % mod;

            a = (a * a) % mod;
            b >>= 1;
        }

        return res;
    }

    public void append(int val) {
        long inv = power(mul, mod-2);
        long x = ((val - add + mod) % mod * inv) % mod;
        list.add(x);
    }

    public void addAll(int inc) {
        add = (add + inc) % mod;
    }

    public void multAll(int m) {
        mul = (mul * m) % mod;
        add = (add * m) % mod;
    }

    public int getIndex(int idx) {
    if(idx >= list.size()) return -1;

    long val = list.get(idx);
    return (int)((val * mul % mod + add) % mod);
}
}