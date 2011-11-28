


<!DOCTYPE html>
<html>
  <head>
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="chrome=1">
        <title>src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java at master from gor-tanachat/Club-Website - GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />

    
    

    <meta content="authenticity_token" name="csrf-param" />
<meta content="uivcqFfMbJo20K0hkJUI8CzQCSZ86j39B2Y7QYS2hbc=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/stylesheets/bundles/github-d45cb618db6d88a10a2b4025cc30f8f1127408d1.css" media="screen" rel="stylesheet" type="text/css" />
    

    <script src="https://a248.e.akamai.net/assets.github.com/javascripts/bundles/jquery-611678f634d346ab8b2ed0ad824a1781ccd9f808.js" type="text/javascript"></script>
    <script src="https://a248.e.akamai.net/assets.github.com/javascripts/bundles/github-88bb05e9be47bb8d41ff82a5381879e5f0393d8f.js" type="text/javascript"></script>
    

      <link rel='permalink' href='/gor-tanachat/Club-Website/blob/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98/src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java'>
    

    <meta name="description" content="Club-Website - WebApps Fall 2011" />
  <link href="https://github.com/gor-tanachat/Club-Website/commits/master.atom" rel="alternate" title="Recent Commits to Club-Website:master" type="application/atom+xml" />

  </head>


  <body class="logged_in page-blob windows env-production ">
    


    

    <div id="main">
      <div id="header" class="true">
          <a class="logo" href="https://github.com/">
            <img alt="github" class="default svg" height="45" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov6.svg?1315858549" />
            <img alt="github" class="default png" height="45" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov6.png?1315858549" />
            <!--[if (gt IE 8)|!(IE)]><!-->
            <img alt="github" class="hover svg" height="45" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov6-hover.svg?1315858549" />
            <img alt="github" class="hover png" height="45" src="https://a248.e.akamai.net/assets.github.com/images/modules/header/logov6-hover.png?1315858549" />
            <!--<![endif]-->
          </a>

          


    <div class="userbox">
      <div class="avatarname">
        <a href="https://github.com/gor-tanachat"><img height="20" src="https://secure.gravatar.com/avatar/bbb9c0598bdb6e5ccb3334f74e932532?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="20" /></a>
        <a href="https://github.com/gor-tanachat" class="name">gor-tanachat</a>
      </div>
      <ul class="usernav">
        <li><a href="https://github.com/">Dashboard</a></li>
        <li>
          <a href="https://github.com/inbox/notifications">Inbox</a>

          <a href="https://github.com/inbox/notifications" class="unread_count ">0</a>
        </li>
        <li><a href="https://github.com/account">Account Settings</a></li>
        <li><a href="/logout">Log Out</a></li>
      </ul>
    </div><!-- /.userbox -->


        <div class="topsearch">
<form action="/search" id="top_search_form" method="get">      <a href="/search" class="advanced-search tooltipped downwards" title="Advanced Search">Advanced Search</a>
      <div class="search placeholder-field js-placeholder-field">
        <label class="placeholder" for="global-search-field">Search…</label>
        <input type="text" class="search my_repos_autocompleter" id="global-search-field" name="q" results="5" /> <input type="submit" value="Search" class="button" />
      </div>
      <input type="hidden" name="type" value="Everything" />
      <input type="hidden" name="repo" value="" />
      <input type="hidden" name="langOverride" value="" />
      <input type="hidden" name="start_value" value="1" />
</form>    <ul class="nav">
        <li class="explore"><a href="https://github.com/explore">Explore GitHub</a></li>
        <li><a href="https://gist.github.com">Gist</a></li>
        <li><a href="/blog">Blog</a></li>
      <li><a href="http://help.github.com">Help</a></li>
    </ul>
</div>

      </div>

      
            <div class="site">
      <div class="pagehead repohead vis-public   instapaper_ignore readability-menu">


      <div class="title-actions-bar">
        <h1>
          <a href="/gor-tanachat">gor-tanachat</a> /
          <strong><a href="/gor-tanachat/Club-Website" class="js-current-repository">Club-Website</a></strong>
        </h1>
        



            <ul class="pagehead-actions">

          <li class="for-owner"><a href="/gor-tanachat/Club-Website/admin" class="minibutton btn-admin "><span><span class="icon"></span>Admin</span></a></li>
        <li class="js-toggler-container watch-button-container on">
          <a href="/gor-tanachat/Club-Website/toggle_watch" class="minibutton btn-watch watch-button js-toggler-target" data-method="post" data-remote="true"><span><span class="icon"></span>Watch</span></a>
          <a href="/gor-tanachat/Club-Website/toggle_watch" class="minibutton btn-watch unwatch-button js-toggler-target" data-method="post" data-remote="true"><span><span class="icon"></span>Unwatch</span></a>
        </li>
            <li><a href="/gor-tanachat/Club-Website/fork" class="minibutton btn-fork fork-button" data-method="post"><span><span class="icon"></span>Fork</span></a></li>

            <li class="nspr">
              <a href="/gor-tanachat/Club-Website/pull/new/master" class="minibutton btn-pull-request "><span><span class="icon"></span>Pull Request</span></a>
            </li>
      <li class="repostats">
        <ul class="repo-stats">
          <li class="watchers watching">
            <a href="/gor-tanachat/Club-Website/watchers" title="Watchers — You're Watching" class="tooltipped downwards">
              2
            </a>
          </li>
          <li class="forks">
            <a href="/gor-tanachat/Club-Website/network" title="Forks - You have a fork" class="tooltipped downwards">
              2
            </a>
          </li>
        </ul>
      </li>
    </ul>

      </div>

        

  <ul class="tabs">
    <li><a href="/gor-tanachat/Club-Website" class="selected" highlight="repo_sourcerepo_downloadsrepo_commitsrepo_tagsrepo_branches">Code</a></li>
    <li><a href="/gor-tanachat/Club-Website/network" highlight="repo_networkrepo_fork_queue">Network</a>
    <li><a href="/gor-tanachat/Club-Website/pulls" highlight="repo_pulls">Pull Requests <span class='counter'>0</span></a></li>

      <li><a href="/gor-tanachat/Club-Website/issues" highlight="repo_issues">Issues <span class='counter'>0</span></a></li>

      <li><a href="/gor-tanachat/Club-Website/wiki" highlight="repo_wiki">Wiki <span class='counter'>0</span></a></li>

    <li><a href="/gor-tanachat/Club-Website/graphs" highlight="repo_graphsrepo_contributors">Stats &amp; Graphs</a></li>

  </ul>

  
<div class="frame frame-center tree-finder" style="display:none"
      data-tree-list-url="/gor-tanachat/Club-Website/tree-list/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98"
      data-blob-url-prefix="/gor-tanachat/Club-Website/blob/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98"
    >

  <div class="breadcrumb">
    <b><a href="/gor-tanachat/Club-Website">Club-Website</a></b> /
    <input class="tree-finder-input" type="text" name="query" autocomplete="off" spellcheck="false">
  </div>

    <div class="octotip">
      <p>
        <a href="/gor-tanachat/Club-Website/dismiss-tree-finder-help" class="dismiss js-dismiss-tree-list-help" title="Hide this notice forever">Dismiss</a>
        <strong>Octotip:</strong> You've activated the <em>file finder</em>
        by pressing <span class="kbd">t</span> Start typing to filter the
        file list. Use <span class="kbd badmono">↑</span> and
        <span class="kbd badmono">↓</span> to navigate,
        <span class="kbd">enter</span> to view files.
      </p>
    </div>

  <table class="tree-browser" cellpadding="0" cellspacing="0">
    <tr class="js-header"><th>&nbsp;</th><th>name</th></tr>
    <tr class="js-no-results no-results" style="display: none">
      <th colspan="2">No matching files</th>
    </tr>
    <tbody class="js-results-list">
    </tbody>
  </table>
</div>

<div id="jump-to-line" style="display:none">
  <h2>Jump to Line</h2>
  <form>
    <input class="textfield" type="text">
    <div class="full-button">
      <button type="submit" class="classy">
        <span>Go</span>
      </button>
    </div>
  </form>
</div>


<div class="subnav-bar">

  <ul class="actions">
    
      <li class="switcher">

        <div class="context-menu-container js-menu-container">
          <span class="text">Current branch:</span>
          <a href="#"
             class="minibutton bigger switcher context-menu-button js-menu-target js-commitish-button btn-branch repo-tree"
             data-master-branch="master"
             data-ref="master">
            <span><span class="icon"></span>master</span>
          </a>

          <div class="context-pane commitish-context js-menu-content">
            <a href="javascript:;" class="close js-menu-close"></a>
            <div class="title">Switch Branches/Tags</div>
            <div class="body pane-selector commitish-selector js-filterable-commitishes">
              <div class="filterbar">
                <div class="placeholder-field js-placeholder-field">
                  <label class="placeholder" for="context-commitish-filter-field" data-placeholder-mode="sticky">Filter branches/tags</label>
                  <input type="text" id="context-commitish-filter-field" class="commitish-filter" />
                </div>

                <ul class="tabs">
                  <li><a href="#" data-filter="branches" class="selected">Branches</a></li>
                  <li><a href="#" data-filter="tags">Tags</a></li>
                </ul>
              </div>

                <div class="commitish-item branch-commitish selector-item">
                  <h4>
                      <a href="/gor-tanachat/Club-Website/blob/develop/src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java" data-name="develop">develop</a>
                  </h4>
                </div>
                <div class="commitish-item branch-commitish selector-item">
                  <h4>
                      <a href="/gor-tanachat/Club-Website/blob/master/src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java" data-name="master">master</a>
                  </h4>
                </div>

                <div class="commitish-item tag-commitish selector-item">
                  <h4>
                      <a href="/gor-tanachat/Club-Website/blob/0.5/src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java" data-name="0.5">0.5</a>
                  </h4>
                </div>

              <div class="no-results" style="display:none">Nothing to show</div>
            </div>
          </div><!-- /.commitish-context-context -->
        </div>

      </li>
  </ul>

  <ul class="subnav">
    <li><a href="/gor-tanachat/Club-Website" class="selected" highlight="repo_source">Files</a></li>
    <li><a href="/gor-tanachat/Club-Website/commits/master" highlight="repo_commits">Commits</a></li>
    <li><a href="/gor-tanachat/Club-Website/branches" class="" highlight="repo_branches">Branches <span class="counter">2</span></a></li>
    <li><a href="/gor-tanachat/Club-Website/tags" class="" highlight="repo_tags">Tags <span class="counter">1</span></a></li>
    <li><a href="/gor-tanachat/Club-Website/downloads" class="blank" highlight="repo_downloads">Downloads <span class="counter">0</span></a></li>
  </ul>

</div>

  
  
  


        

      </div><!-- /.pagehead -->

      




  
  <p class="last-commit">Latest commit to the <strong>master</strong> branch</p>

<div class="commit commit-tease js-details-container">
  <p class="commit-title ">
      <a href="/gor-tanachat/Club-Website/commit/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98" class="message">merged</a>
      
  </p>
  <div class="commit-meta">
    <a href="/gor-tanachat/Club-Website/commit/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98" class="sha-block">commit <span class="sha">aac2c2ad69</span></a>

    <div class="authorship">
      <img class="gravatar" height="20" src="https://secure.gravatar.com/avatar/bbb9c0598bdb6e5ccb3334f74e932532?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-140.png" width="20" />
      <span class="author-name"><a href="/gor-tanachat">gor-tanachat</a></span>
      authored <time class="js-relative-date" datetime="2011-11-27T18:36:38-08:00" title="2011-11-27 18:36:38">November 27, 2011</time>

    </div>
  </div>
</div>


  <div id="slider">

    <div class="breadcrumb" data-path="src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java/">
      <b><a href="/gor-tanachat/Club-Website/tree/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98" class="js-rewrite-sha">Club-Website</a></b> / <a href="/gor-tanachat/Club-Website/tree/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98/src" class="js-rewrite-sha">src</a> / <a href="/gor-tanachat/Club-Website/tree/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98/src/edu" class="js-rewrite-sha">edu</a> / <a href="/gor-tanachat/Club-Website/tree/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98/src/edu/cmu" class="js-rewrite-sha">cmu</a> / <a href="/gor-tanachat/Club-Website/tree/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98/src/edu/cmu/cs15437" class="js-rewrite-sha">cs15437</a> / <a href="/gor-tanachat/Club-Website/tree/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98/src/edu/cmu/cs15437/clubwebsite" class="js-rewrite-sha">clubwebsite</a> / <a href="/gor-tanachat/Club-Website/tree/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98/src/edu/cmu/cs15437/clubwebsite/controller" class="js-rewrite-sha">controller</a> / ProfileEditAction.java       <span style="display:none" id="clippy_3145" class="clippy-text">src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java</span>
      
      <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"
              width="110"
              height="14"
              class="clippy"
              id="clippy" >
      <param name="movie" value="https://a248.e.akamai.net/assets.github.com/flash/clippy.swf?1315867478?v5"/>
      <param name="allowScriptAccess" value="always" />
      <param name="quality" value="high" />
      <param name="scale" value="noscale" />
      <param NAME="FlashVars" value="id=clippy_3145&amp;copied=copied!&amp;copyto=copy to clipboard">
      <param name="bgcolor" value="#FFFFFF">
      <param name="wmode" value="opaque">
      <embed src="https://a248.e.akamai.net/assets.github.com/flash/clippy.swf?1315867478?v5"
             width="110"
             height="14"
             name="clippy"
             quality="high"
             allowScriptAccess="always"
             type="application/x-shockwave-flash"
             pluginspage="http://www.macromedia.com/go/getflashplayer"
             FlashVars="id=clippy_3145&amp;copied=copied!&amp;copyto=copy to clipboard"
             bgcolor="#FFFFFF"
             wmode="opaque"
      />
      </object>
      

    </div>

    <div class="frames">
      <div class="frame frame-center" data-path="src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java/" data-permalink-url="/gor-tanachat/Club-Website/blob/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98/src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java" data-title="src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java at master from gor-tanachat/Club-Website - GitHub" data-type="blob">
          <ul class="big-actions">
            <li><a class="file-edit-link minibutton js-rewrite-sha" href="/gor-tanachat/Club-Website/edit/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98/src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java" data-method="post"><span>Edit this file</span></a></li>
          </ul>

        <div id="files">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><img alt="Txt" height="16" src="https://a248.e.akamai.net/assets.github.com/images/icons/txt.png?1315867479" width="16" /></span>
                <span class="mode" title="File Mode">100644</span>
                  <span>78 lines (59 sloc)</span>
                <span>2.258 kb</span>
              </div>
              <ul class="actions">
                <li><a href="/gor-tanachat/Club-Website/raw/master/src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java" id="raw-url">raw</a></li>
                  <li><a href="/gor-tanachat/Club-Website/blame/master/src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java">blame</a></li>
                <li><a href="/gor-tanachat/Club-Website/commits/master/src/edu/cmu/cs15437/clubwebsite/controller/ProfileEditAction.java" rel="nofollow">history</a></li>
              </ul>
            </div>
              <div class="data type-java">
      <table cellpadding="0" cellspacing="0" class="lines">
        <tr>
          <td>
            <pre class="line_numbers"><span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
</pre>
          </td>
          <td width="100%">
                <div class="highlight"><pre><div class='line' id='LC1'><span class="kn">package</span> <span class="n">edu</span><span class="o">.</span><span class="na">cmu</span><span class="o">.</span><span class="na">cs15437</span><span class="o">.</span><span class="na">clubwebsite</span><span class="o">.</span><span class="na">controller</span><span class="o">;</span></div><div class='line' id='LC2'><br/></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">java.util.ArrayList</span><span class="o">;</span></div><div class='line' id='LC4'><span class="kn">import</span> <span class="nn">java.util.List</span><span class="o">;</span></div><div class='line' id='LC5'><br/></div><div class='line' id='LC6'><span class="kn">import</span> <span class="nn">javax.servlet.http.HttpServletRequest</span><span class="o">;</span></div><div class='line' id='LC7'><span class="kn">import</span> <span class="nn">javax.servlet.http.HttpSession</span><span class="o">;</span></div><div class='line' id='LC8'><br/></div><div class='line' id='LC9'><span class="kn">import</span> <span class="nn">org.mybeans.dao.DAOException</span><span class="o">;</span></div><div class='line' id='LC10'><span class="kn">import</span> <span class="nn">org.mybeans.form.FormBeanException</span><span class="o">;</span></div><div class='line' id='LC11'><span class="kn">import</span> <span class="nn">org.mybeans.form.FormBeanFactory</span><span class="o">;</span></div><div class='line' id='LC12'><br/></div><div class='line' id='LC13'><span class="kn">import</span> <span class="nn">edu.cmu.cs15437.clubwebsite.databeans.UserBean</span><span class="o">;</span></div><div class='line' id='LC14'><span class="kn">import</span> <span class="nn">edu.cmu.cs15437.clubwebsite.formbeans.ProfileEditForm</span><span class="o">;</span></div><div class='line' id='LC15'><span class="kn">import</span> <span class="nn">edu.cmu.cs15437.clubwebsite.model.Model</span><span class="o">;</span></div><div class='line' id='LC16'><span class="kn">import</span> <span class="nn">edu.cmu.cs15437.clubwebsite.model.UserDAO</span><span class="o">;</span></div><div class='line' id='LC17'><br/></div><div class='line' id='LC18'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">ProfileEditAction</span> <span class="kd">extends</span> <span class="n">Action</span> <span class="o">{</span></div><div class='line' id='LC19'>	<span class="kd">private</span> <span class="n">FormBeanFactory</span><span class="o">&lt;</span> <span class="n">ProfileEditForm</span> <span class="o">&gt;</span> <span class="n">profileEditFormBeanFactory</span> <span class="o">=</span> <span class="n">FormBeanFactory</span><span class="o">.</span><span class="na">getInstance</span><span class="o">(</span><span class="n">ProfileEditForm</span><span class="o">.</span><span class="na">class</span><span class="o">);</span></div><div class='line' id='LC20'>	<span class="kd">private</span> <span class="n">UserDAO</span> <span class="n">userDAO</span><span class="o">;</span></div><div class='line' id='LC21'><br/></div><div class='line' id='LC22'>	<span class="kd">public</span> <span class="nf">ProfileEditAction</span><span class="o">(</span><span class="n">Model</span> <span class="n">model</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC23'>		<span class="n">userDAO</span> <span class="o">=</span> <span class="n">model</span><span class="o">.</span><span class="na">getUserDAO</span><span class="o">();</span></div><div class='line' id='LC24'>	<span class="o">}</span></div><div class='line' id='LC25'><br/></div><div class='line' id='LC26'>	<span class="kd">public</span> <span class="n">String</span> <span class="nf">getName</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC27'>		<span class="k">return</span> <span class="s">&quot;profileEdit.do&quot;</span><span class="o">;</span></div><div class='line' id='LC28'>	<span class="o">}</span></div><div class='line' id='LC29'><br/></div><div class='line' id='LC30'>	<span class="kd">public</span> <span class="n">String</span> <span class="nf">perform</span><span class="o">(</span><span class="n">HttpServletRequest</span> <span class="n">request</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC31'>		<span class="n">List</span><span class="o">&lt;</span> <span class="n">String</span> <span class="o">&gt;</span> <span class="n">errors</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span> <span class="n">String</span> <span class="o">&gt;();</span></div><div class='line' id='LC32'>		<span class="n">request</span><span class="o">.</span><span class="na">setAttribute</span><span class="o">(</span><span class="s">&quot;errors&quot;</span><span class="o">,</span> <span class="n">errors</span><span class="o">);</span></div><div class='line' id='LC33'><br/></div><div class='line' id='LC34'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC35'>			<span class="n">ProfileEditForm</span> <span class="n">form</span> <span class="o">=</span> <span class="n">profileEditFormBeanFactory</span><span class="o">.</span><span class="na">create</span><span class="o">(</span><span class="n">request</span><span class="o">);</span></div><div class='line' id='LC36'><br/></div><div class='line' id='LC37'>			<span class="c1">// No form is passed in; let the user try again</span></div><div class='line' id='LC38'>			<span class="k">if</span> <span class="o">(!</span> <span class="n">form</span><span class="o">.</span><span class="na">isPresent</span><span class="o">())</span> <span class="o">{</span></div><div class='line' id='LC39'>				<span class="k">return</span> <span class="s">&quot;profileEdit.jsp&quot;</span><span class="o">;</span></div><div class='line' id='LC40'>			<span class="o">}</span></div><div class='line' id='LC41'><br/></div><div class='line' id='LC42'>			<span class="k">if</span> <span class="o">(</span><span class="n">form</span><span class="o">.</span><span class="na">getButton</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;Change Password&quot;</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC43'>				<span class="c1">// User wants to change password</span></div><div class='line' id='LC44'>				<span class="k">return</span> <span class="s">&quot;changePassword.jsp&quot;</span><span class="o">;</span></div><div class='line' id='LC45'>			<span class="o">}</span></div><div class='line' id='LC46'><br/></div><div class='line' id='LC47'><br/></div><div class='line' id='LC48'>			<span class="n">errors</span><span class="o">.</span><span class="na">addAll</span><span class="o">(</span><span class="n">form</span><span class="o">.</span><span class="na">getValidationErrors</span><span class="o">());</span></div><div class='line' id='LC49'>			<span class="c1">// If there is any error; let the user try again</span></div><div class='line' id='LC50'>			<span class="k">if</span> <span class="o">(</span><span class="n">errors</span><span class="o">.</span><span class="na">size</span><span class="o">()</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC51'>				<span class="k">return</span> <span class="s">&quot;profileEdit.jsp&quot;</span><span class="o">;</span></div><div class='line' id='LC52'>			<span class="o">}</span></div><div class='line' id='LC53'><br/></div><div class='line' id='LC54'><br/></div><div class='line' id='LC55'>			<span class="c1">// Update User Info</span></div><div class='line' id='LC56'>			<span class="n">UserBean</span> <span class="n">user</span> <span class="o">=</span> <span class="o">(</span><span class="n">UserBean</span><span class="o">)</span> <span class="n">request</span><span class="o">.</span><span class="na">getSession</span><span class="o">().</span><span class="na">getAttribute</span><span class="o">(</span><span class="s">&quot;user&quot;</span><span class="o">);</span></div><div class='line' id='LC57'>			<span class="n">userDAO</span><span class="o">.</span><span class="na">updateFirstName</span><span class="o">(</span><span class="n">user</span><span class="o">.</span><span class="na">getUserId</span><span class="o">(),</span> <span class="n">form</span><span class="o">.</span><span class="na">getFirstName</span><span class="o">());</span></div><div class='line' id='LC58'>			<span class="n">userDAO</span><span class="o">.</span><span class="na">updateLastName</span><span class="o">(</span><span class="n">user</span><span class="o">.</span><span class="na">getUserId</span><span class="o">(),</span> <span class="n">form</span><span class="o">.</span><span class="na">getLastName</span><span class="o">());</span></div><div class='line' id='LC59'>			<span class="n">userDAO</span><span class="o">.</span><span class="na">updateSex</span><span class="o">(</span><span class="n">user</span><span class="o">.</span><span class="na">getUserId</span><span class="o">(),</span> <span class="n">form</span><span class="o">.</span><span class="na">getSex</span><span class="o">());</span></div><div class='line' id='LC60'>			<span class="n">userDAO</span><span class="o">.</span><span class="na">updateUserName</span><span class="o">(</span><span class="n">user</span><span class="o">.</span><span class="na">getUserId</span><span class="o">(),</span> <span class="n">form</span><span class="o">.</span><span class="na">getUserName</span><span class="o">());</span></div><div class='line' id='LC61'>			<span class="n">user</span> <span class="o">=</span> <span class="n">userDAO</span><span class="o">.</span><span class="na">lookupWithUserId</span><span class="o">(</span><span class="n">user</span><span class="o">.</span><span class="na">getUserId</span><span class="o">());</span></div><div class='line' id='LC62'><br/></div><div class='line' id='LC63'>			<span class="c1">// Remember the user</span></div><div class='line' id='LC64'>			<span class="n">HttpSession</span> <span class="n">session</span> <span class="o">=</span> <span class="n">request</span><span class="o">.</span><span class="na">getSession</span><span class="o">();</span></div><div class='line' id='LC65'>			<span class="n">session</span><span class="o">.</span><span class="na">setAttribute</span><span class="o">(</span><span class="s">&quot;user&quot;</span><span class="o">,</span> <span class="n">user</span><span class="o">);</span></div><div class='line' id='LC66'><br/></div><div class='line' id='LC67'>			<span class="k">return</span> <span class="s">&quot;profile.jsp&quot;</span><span class="o">;</span></div><div class='line' id='LC68'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">DAOException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC69'>			<span class="n">errors</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">e</span><span class="o">.</span><span class="na">getMessage</span><span class="o">());</span></div><div class='line' id='LC70'>			<span class="k">return</span> <span class="s">&quot;profileEdit.jsp&quot;</span><span class="o">;</span></div><div class='line' id='LC71'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">FormBeanException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC72'>			<span class="n">errors</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">e</span><span class="o">.</span><span class="na">getMessage</span><span class="o">());</span></div><div class='line' id='LC73'>			<span class="k">return</span> <span class="s">&quot;profileEdit.jsp&quot;</span><span class="o">;</span></div><div class='line' id='LC74'>		<span class="o">}</span></div><div class='line' id='LC75'>	<span class="o">}</span></div><div class='line' id='LC76'><span class="o">}</span></div><div class='line' id='LC77'><br/></div><div class='line' id='LC78'><br/></div></pre></div>
          </td>
        </tr>
      </table>
  </div>

          </div>
        </div>
      </div>
    </div>

  </div>

<div class="frame frame-loading" style="display:none;" data-tree-list-url="/gor-tanachat/Club-Website/tree-list/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98" data-blob-url-prefix="/gor-tanachat/Club-Website/blob/aac2c2ad69e4811fe2a2744b52e7d38c608bfa98">
  <img src="https://a248.e.akamai.net/assets.github.com/images/modules/ajax/big_spinner_336699.gif?1310086001" height="32" width="32">
</div>

    </div>

    </div>

    <!-- footer -->
    <div id="footer" >
      
  <div class="upper_footer">
     <div class="site" class="clearfix">

       <!--[if IE]><h4 id="blacktocat_ie">GitHub Links</h4><![endif]-->
       <![if !IE]><h4 id="blacktocat">GitHub Links</h4><![endif]>

       <ul class="footer_nav">
         <h4>GitHub</h4>
         <li><a href="https://github.com/about">About</a></li>
         <li><a href="https://github.com/blog">Blog</a></li>
         <li><a href="https://github.com/features">Features</a></li>
         <li><a href="https://github.com/contact">Contact &amp; Support</a></li>
         <li><a href="https://github.com/training">Training</a></li>
         <li><a href="http://status.github.com/">Site Status</a></li>
       </ul>

       <ul class="footer_nav">
         <h4>Tools</h4>
         <li><a href="http://mac.github.com/">GitHub for Mac</a></li>
         <li><a href="http://mobile.github.com/">Issues for iPhone</a></li>
         <li><a href="https://gist.github.com">Gist: Code Snippets</a></li>
         <li><a href="http://enterprise.github.com/">GitHub Enterprise</a></li>
         <li><a href="http://jobs.github.com/">Job Board</a></li>
       </ul>

       <ul class="footer_nav">
         <h4>Extras</h4>
         <li><a href="http://shop.github.com/">GitHub Shop</a></li>
         <li><a href="http://octodex.github.com/">The Octodex</a></li>
       </ul>

       <ul class="footer_nav">
         <h4>Documentation</h4>
         <li><a href="http://help.github.com/">GitHub Help</a></li>
         <li><a href="http://developer.github.com/">Developer API</a></li>
         <li><a href="http://github.github.com/github-flavored-markdown/">GitHub Flavored Markdown</a></li>
         <li><a href="http://pages.github.com/">GitHub Pages</a></li>
       </ul>

     </div><!-- /.site -->
  </div><!-- /.upper_footer -->

<div class="lower_footer">
  <div class="site" class="clearfix">
    <!--[if IE]><div id="legal_ie"><![endif]-->
    <![if !IE]><div id="legal"><![endif]>
      <ul>
          <li><a href="https://github.com/site/terms">Terms of Service</a></li>
          <li><a href="https://github.com/site/privacy">Privacy</a></li>
          <li><a href="https://github.com/security">Security</a></li>
      </ul>

      <p>&copy; 2011 <span id="_rrt" title="0.26383s from fe7.rs.github.com">GitHub</span> Inc. All rights reserved.</p>
    </div><!-- /#legal or /#legal_ie-->

      <div class="sponsor">
        <a href="http://www.rackspace.com" class="logo">
          <img alt="Dedicated Server" height="36" src="https://a248.e.akamai.net/assets.github.com/images/modules/footer/rackspace_logo.png?v2" width="38" />
        </a>
        Powered by the <a href="http://www.rackspace.com ">Dedicated
        Servers</a> and<br/> <a href="http://www.rackspacecloud.com">Cloud
        Computing</a> of Rackspace Hosting<span>&reg;</span>
      </div>
  </div><!-- /.site -->
</div><!-- /.lower_footer -->

    </div><!-- /#footer -->

    

<div id="keyboard_shortcuts_pane" class="instapaper_ignore readability-extra" style="display:none">
  <h2>Keyboard Shortcuts <small><a href="#" class="js-see-all-keyboard-shortcuts">(see all)</a></small></h2>

  <div class="columns threecols">
    <div class="column first">
      <h3>Site wide shortcuts</h3>
      <dl class="keyboard-mappings">
        <dt>s</dt>
        <dd>Focus site search</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>?</dt>
        <dd>Bring up this help dialog</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column middle" style='display:none'>
      <h3>Commit list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selection down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selection up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>c <em>or</em> o <em>or</em> enter</dt>
        <dd>Open commit</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>y</dt>
        <dd>Expand URL to its canonical form</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column last" style='display:none'>
      <h3>Pull request list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selection down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selection up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>o <em>or</em> enter</dt>
        <dd>Open issue</dd>
      </dl>
    </div><!-- /.columns.last -->

  </div><!-- /.columns.equacols -->

  <div style='display:none'>
    <div class="rule"></div>

    <h3>Issues</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>x</dt>
          <dd>Toggle selection</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open issue</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column middle">
        <dl class="keyboard-mappings">
          <dt>I</dt>
          <dd>Mark selection as read</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>U</dt>
          <dd>Mark selection as unread</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>e</dt>
          <dd>Close selection</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>y</dt>
          <dd>Remove selection from view</dd>
        </dl>
      </div><!-- /.column.middle -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>c</dt>
          <dd>Create issue</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Create label</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>i</dt>
          <dd>Back to inbox</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>u</dt>
          <dd>Back to issues</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>/</dt>
          <dd>Focus issues search</dd>
        </dl>
      </div>
    </div>
  </div>

  <div style='display:none'>
    <div class="rule"></div>

    <h3>Issues Dashboard</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open issue</dd>
        </dl>
      </div><!-- /.column.first -->
    </div>
  </div>

  <div style='display:none'>
    <div class="rule"></div>

    <h3>Network Graph</h3>
    <div class="columns equacols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt><span class="badmono">←</span> <em>or</em> h</dt>
          <dd>Scroll left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">→</span> <em>or</em> l</dt>
          <dd>Scroll right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↑</span> <em>or</em> k</dt>
          <dd>Scroll up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↓</span> <em>or</em> j</dt>
          <dd>Scroll down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Toggle visibility of head labels</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">←</span> <em>or</em> shift h</dt>
          <dd>Scroll all the way left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">→</span> <em>or</em> shift l</dt>
          <dd>Scroll all the way right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↑</span> <em>or</em> shift k</dt>
          <dd>Scroll all the way up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↓</span> <em>or</em> shift j</dt>
          <dd>Scroll all the way down</dd>
        </dl>
      </div><!-- /.column.last -->
    </div>
  </div>

  <div >
    <div class="rule"></div>
    <div class="columns threecols">
      <div class="column first" >
        <h3>Source Code Browsing</h3>
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Activates the file finder</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Jump to line</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>w</dt>
          <dd>Switch branch/tag</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>y</dt>
          <dd>Expand URL to its canonical form</dd>
        </dl>
      </div>
    </div>
  </div>
</div>

    <div id="markdown-help" class="instapaper_ignore readability-extra">
  <h2>Markdown Cheat Sheet</h2>

  <div class="cheatsheet-content">

  <div class="mod">
    <div class="col">
      <h3>Format Text</h3>
      <p>Headers</p>
      <pre>
# This is an &lt;h1&gt; tag
## This is an &lt;h2&gt; tag
###### This is an &lt;h6&gt; tag</pre>
     <p>Text styles</p>
     <pre>
*This text will be italic*
_This will also be italic_
**This text will be bold**
__This will also be bold__

*You **can** combine them*
</pre>
    </div>
    <div class="col">
      <h3>Lists</h3>
      <p>Unordered</p>
      <pre>
* Item 1
* Item 2
  * Item 2a
  * Item 2b</pre>
     <p>Ordered</p>
     <pre>
1. Item 1
2. Item 2
3. Item 3
   * Item 3a
   * Item 3b</pre>
    </div>
    <div class="col">
      <h3>Miscellaneous</h3>
      <p>Images</p>
      <pre>
![GitHub Logo](/images/logo.png)
Format: ![Alt Text](url)
</pre>
     <p>Links</p>
     <pre>
http://github.com - automatic!
[GitHub](http://github.com)</pre>
<p>Blockquotes</p>
     <pre>
As Kanye West said:
> We're living the future so
> the present is our past.
</pre>
    </div>
  </div>
  <div class="rule"></div>

  <h3>Code Examples in Markdown</h3>
  <div class="col">
      <p>Syntax highlighting with <a href="http://github.github.com/github-flavored-markdown/" title="GitHub Flavored Markdown" target="_blank">GFM</a></p>
      <pre>
```javascript
function fancyAlert(arg) {
  if(arg) {
    $.facebox({div:'#foo'})
  }
}
```</pre>
    </div>
    <div class="col">
      <p>Or, indent your code 4 spaces</p>
      <pre>
Here is a Python code example
without syntax highlighting:

    def foo:
      if not bar:
        return true</pre>
    </div>
    <div class="col">
      <p>Inline code for comments</p>
      <pre>
I think you should use an
`&lt;addr&gt;` element here instead.</pre>
    </div>
  </div>

  </div>
</div>

    <div class="context-overlay"></div>

    <div class="ajax-error-message">
      <p><span class="icon"></span> Something went wrong with that request. Please try again. <a href="javascript:;" class="ajax-error-dismiss">Dismiss</a></p>
    </div>

    
    
    
  </body>
</html>

