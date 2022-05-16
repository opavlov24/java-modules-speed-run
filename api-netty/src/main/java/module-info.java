module engage.core.api.netty {
    requires engage.core.api;
    provides io.falcon.engage.api.request.CommentApi with io.falcon.engage.api.netty.NettyCommentApi;
}