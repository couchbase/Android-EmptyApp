## Empty App

EmptyApp is minimal application that can be used to verify your installation works correctly.

### Install

EmptyApp requires Android-Couchbase to run, you can find this @ https://github.com/couchbase/Android-Couchbase, Follow the intructions for `Use existing application` to make sure EmptyApp works with your Android-Couchbase library.

### Run

Right click the EmptyApp project and select `Run As -> Android Application`, the installation should take around a minute and in the log you should see:

    V/Couchbase( 1505): Apache CouchDB has started. Time to relax.
    V/Couchbase( 1505): [info] [<0.41.0>] Apache CouchDB has started on http://0.0.0.0:34680/
    V/EmptyApp( 1505): Couchbase has started
    V/Couchbase( 1505): =PROGRESS REPORT==== 16-Aug-2011::16:47:38 ===
    V/Couchbase( 1505):          application: couch
    V/Couchbase( 1505):           started_at: nonode@nohost