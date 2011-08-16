## Empty App

EmptyApp is minimal application that can be used to verify your installation works correctly.

### Install

    git clone git://github.com/couchbase/Android-EmptyApp.git
    git clone git://github.com/couchbaselabs/Android-Couchbase.git

And open both (`File -> Import -> Existing Projects`) projects in eclipse

You will need to ensure EmptyApp has the correct path to Android-Couchbase, right click the EmptyApp project and select `Properties -> Android` and in the bottom right make sure to add the Android-Couchbase library.

Now right click the EmptyApp project and select `Run As -> Android Application`, the installation should take around a minute and in the log you should see:

    V/Couchbase( 1505): Apache CouchDB has started. Time to relax.
    V/Couchbase( 1505): [info] [<0.41.0>] Apache CouchDB has started on http://0.0.0.0:34680/
    V/EmptyApp( 1505): Couchbase has started
    V/Couchbase( 1505): =PROGRESS REPORT==== 16-Aug-2011::16:47:38 ===
    V/Couchbase( 1505):          application: couch
    V/Couchbase( 1505):           started_at: nonode@nohost