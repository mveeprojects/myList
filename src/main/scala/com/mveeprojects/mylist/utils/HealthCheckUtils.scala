package com.mveeprojects.mylist.utils

import com.mveeprojects.mylist.repo.CouchbaseConnection

class HealthCheckUtils extends CouchbaseConnection {

  def getBucketName: String =
    mylistbucket.bucketManager().info().name()
}
