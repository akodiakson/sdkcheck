# sdkcheck
What version is your user running?

Replaces checks like: 

if(android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){...}

with:

if(Sdk.getInstance().isAtLeastLollipop()){
...
}


compile 'com.github.akodiakson:sdkcheck:0.1.4'
