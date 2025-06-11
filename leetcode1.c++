int solve(vector<int>& a,int k){
    int n=a.size();
    int INF=1e9;
    int s[2][2]={{INF,INF},{INF,INF}};
    int op=0,ep=0,c=0,ans=-INF;
    int last=-1;
    vector<array<int,3>> pre;
    pre.push_back({0,0,0});
    for(int i=0;i<n;i++){
        c+=a[i];
        if(a[i]==1) op++;
        else if(a[i]==-1) ep++;
        if(i-last>=k){
            while(i-last>=k){
                if(op==pre[last+1][1] or ep==pre[last+1][2]) break;
                last++;
                s[pre[last][1]%2][pre[last][2]%2]=min(s[pre[last][1]%2][pre[last][2]%2],pre[last][0]);
            }
        }
        if(i>=k-1){
            int opr=1^(op%2),epr=ep%2;
            if(s[opr][epr]!=INF) ans=max(ans,c-s[opr][epr]);
        }
        pre.push_back({c,op,ep});
    }
    return ans;
}
class Solution {
public:
    int maxDifference(string s, int k) {
        int ans=-1e9;
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++){
                if(i==j) continue;
                vector<int> res;
                for(char ch:s) if(ch-'0'==i) res.push_back(1); else if(ch-'0'==j) res.push_back(-1); else res.push_back(0);
                ans=max(ans,solve(res,k));
            }
        return ans;
    }
};