var gulpModules={
    gulp:require('gulp'),
    gulpUtil:require('gulp-util'),
    gulpJade:require('gulp-pug'),
    gulpConcat:require('gulp-concat'),
    gulpJshint:require('gulp-jshint'),
    gulpReplace:require('gulp-replace'),
}
var processPath={
    jadePath:"../front/jade/*.jade",
    jade2htmlPath:'../view/html/',
    jsPath:'../front/js/*.js',
    js2onePath:'../view/js/'
}
var taskNames={
    jade2html:'jade2html',
    watch:'watch',
    js2one:'js2one'
}
var optionsForJade={
    pretty:true
}
var optionsForReplace={
    toReplace:'hhhh',
    afterReplace:"script(src='view/js/app.js')"
}
var optionsForLivereload={
    // port :                    Server port
    // host                     Server host
    // basePath                 Path to prepend all given paths
    // start                    Automatically start
    //  quiet        false       Disable console logging
    // reloadPage   index.html  Path to the browser's current page for a full page reload
}
var globalVariable={
    eventPath:"",
    eventType:""
}
gulpModules.gulp.task(taskNames.jade2html, function buildHTML() {
    return gulpModules.gulp.src(processPath.jadePath)
        .pipe(gulpModules.gulpReplace(optionsForReplace.toReplace,optionsForReplace.afterReplace))
        .pipe(gulpModules.gulpJade(optionsForJade))
        .pipe(gulpModules.gulp.dest(processPath.jade2htmlPath))
      
});
gulpModules.gulp.task(taskNames.js2one,function () {
    return gulpModules.gulp.src(processPath.jsPath)
        .pipe(gulpModules.gulpJshint())
        .pipe(gulpModules.gulpJshint.reporter('default'))
        .pipe(gulpModules.gulpConcat("app.js"))
        .pipe(gulpModules.gulp.dest(processPath.js2onePath))
})
gulpModules.gulp.task(taskNames.watch,function () {
    //监视jade路径下的文件是否有修改
    gulpModules.gulp.watch(processPath.jadePath,[taskNames.jade2html]);
    gulpModules.gulp.watch(processPath.jsPath,[taskNames.js2one]);
    //如果是监听多个文件，使用一个数组就可以
    gulpModules.gulp.watch([processPath.jadePath,processPath.jsPath],function (event) {
        //console.log('File ' + event.path + ' was ' + event.type + ', running tasks...');
        globalVariable.eventPath=event.path;
        globalVariable.eventType=event.type;
        gulpModules.gulpUtil.log("File-->"+globalVariable.eventPath);
        gulpModules.gulpUtil.log("event:"+globalVariable.eventType);
    });
})
gulpModules.gulp.task('default', [taskNames.watch,taskNames.jade2html,taskNames.js2one]);

